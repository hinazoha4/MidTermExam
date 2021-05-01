
package f2019027009.mid.server;
import java.net.*;  
import java.io.*;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class server{  
public static void main(String args[])throws Exception{  
ServerSocket my=new ServerSocket(3333);  
Socket message=my.accept();  
DataInputStream din=new DataInputStream(message.getInputStream());  
DataOutputStream dout=new DataOutputStream(message.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("stop")){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
message.close();  
my.close();  
}}  