package f2019027009.mid.server;
import java.net.*;  
import java.io.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
class client{  

    public static void main(String args[])throws Exception{  
Socket message=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(message.getInputStream());  
DataOutputStream dout=new DataOutputStream(message.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("stop")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  
  
dout.close();  
message.close();  
}}  