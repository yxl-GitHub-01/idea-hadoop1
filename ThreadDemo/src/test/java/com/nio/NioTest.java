package com.nio;

import com.nio.com.Student;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class NioTest {
    @Test
    public void testNio(){
        try {
            FileInputStream fin = new FileInputStream("D://3.jpg");
            FileChannel fc =   fin.getChannel();

            FileOutputStream fout = new FileOutputStream("d://43.jpg");
            FileChannel foc = fout.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024*8);
            while(fc.read(buf) !=-1){
                buf.flip();
                foc.write(buf);
                buf.clear();
            }
            fin.close();
            fout.close();
            fc.close();
            foc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testClass(){
        Student s1 = new Student();
        Class class1 = s1.getClass();
        System.out.println(class1.getName());
        System.out.println(Student.class==class1);

        try {
            Class class3 = Class.forName("com.nio.com.Student").getDeclaringClass();
            System.out.println(class3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ByteBuffer buf = ByteBuffer.allocateDirect(1024);
    }

    public static void main(String[] args) {
        String testInfo = "TMQJD_444831107971435918_M0110004_M0110004_1_0_0_444831107972435918_3";
        String sourceStrArray[] = testInfo.split(",");
        List<String> goodsListCheck = new ArrayList<String>();
        for (int i = 0; i < sourceStrArray.length; i++) {
            goodsListCheck.add(sourceStrArray[i].trim());
        }
        System.out.println(goodsListCheck.get(0));
    }

}
