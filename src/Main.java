import model.IRoom;
import model.Room;

import java.io.*;

public class Main {


    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("src/a_solar.txt");
            out = new FileOutputStream("output.txt");
            int c= in.read();
            char s = (char) c;
            StringBuilder line = new StringBuilder();
            while (s!= '\n' ){
                line.append(s);
                c = in.read();
                s = (char) c;
            }
            String[] strings= line.toString().split(" ");
            int width = Integer.parseInt(strings[0]);
            int height = Integer.parseInt(strings[1]);
            int counterY = 0;
            int counterX = 0;
            line = new StringBuilder();
            IRoom room = new Room();
            room.setWidth(width);
            room.setLength(height);
            while(counterY < height){
                c = in.read();
                s = (char) c;
                counterX++;
                line.append(s);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
