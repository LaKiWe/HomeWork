import java.io.*;
import java.net.Socket;

public class MailBox{
    private String mailHost;
    private boolean hostSet;
    private String Auth_account;
    private String Auth_passwd;
    private String receiver_mail;
    private boolean receiverSet;
    MailBox(){
        mailHost=null;
        hostSet=false;
        Auth_account=null;
        Auth_passwd=null;
        receiver_mail=null;
        receiverSet=false;
    }
    public void set_Host(String host_val){mailHost=host_val;hostSet=true;}
    public void set_Auth(String acc_val,String passwd_val){Auth_account=acc_val;Auth_passwd=passwd_val;}
    public void set_receiver_Mail(String receiver) {receiver_mail=receiver;receiverSet=true;}

    //SMTP
    public void Send_start() throws Exception {
        if(!(hostSet&receiverSet)) throw new Exception("Host or receiver WRONG");
        Socket smtpSoc=null;

            smtpSoc=new Socket(mailHost.split(" , ")[0], Integer.parseInt(mailHost.split(" , ")[1]));
            InputStream serverRep=smtpSoc.getInputStream();
            BufferedReader serverRep_BR=new BufferedReader(new InputStreamReader(serverRep));

            OutputStream sendServer=smtpSoc.getOutputStream();
            PrintWriter sendServer_PW=new PrintWriter(sendServer);
            //send comm
            if(send_preComm(sendServer_PW,serverRep_BR))

            sendServer_PW.println("DATA");

            sendServer_PW.print("\n.\n");
            smtpSoc.close();

    }
    /*
     * @function: send_preComm()
     * @param: PrintWriter pw,BufferedReader BR
     * @return: boolean check, throws Exception
     * @explanation: send [HELO],[Auth Login],[set receiver and sender] comms and check if success
     */
    private boolean send_preComm(PrintWriter PW,BufferedReader BR)throws Exception{
        String temp="null";

        PW.println("HELO SocketMail");
        temp=BR.readLine();
        if(Integer.parseInt(temp.substring(0,3))>400) return false;

        temp="null";
        PW.println("Auth Login");
        temp=BR.readLine();
        if(Integer.parseInt(temp.substring(0,3))>400) return false;

        temp="null";
        PW.println(Auth_account);
        PW.println(Auth_passwd);
        temp=BR.readLine();
        if(Integer.parseInt(temp.substring(0,3))>400) return false;

        temp="null";
        PW.println("SEND FROM: <"+Auth_account+">");
        PW.println("RCPT TO: <"+receiver_mail+">");
        temp=BR.readLine();
        if(Integer.parseInt(temp.substring(0,3))>400) return false;

        return true;
    }
    //POP3
    public void Receive_start() throws Exception{

    }
}
