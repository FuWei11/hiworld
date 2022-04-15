package com.bdqn.dao;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo {
 public static void main(String[]args) {
     try {
         Socket s = new Socket("127.0.0.1", 8888);

         OutputStream os = s.getOutputStream();
         DataOutputStream dos = new DataOutputStream(os);

         //使用Scanner读取控制台的输入，并发送到服务端
         Scanner sc = new Scanner(System.in);

         String str = sc.next();
         String d ="sdvcsdc";
         dos.close();
         s.close();
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
 }
 }
