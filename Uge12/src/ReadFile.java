import sun.org.mozilla.javascript.internal.EcmaError;

import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFile {
    private BufferedReader br;
    public ReadFile(String file){
        try{
            br = new BufferedReader(new FileReader(file));
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public int[] ReadInts(){
        int[] temp;
        try {
            int lines = 0;
            while (br.readLine() != null) lines++;
            temp = new int[lines];
            int i = 0;
            for (String line; (line = br.readLine()) !=null;) {
                temp[i] = Integer.parseInt(line);
                i++;
            }
            return temp;
        } catch (Exception e){
            System.out.println(e);
        }
        return new int[]{0};
    }

}
