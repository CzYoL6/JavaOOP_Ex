package TxtFilter;

import java.io.*;

public class TxtFilter {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\");
        File[] txtFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //System.out.println(name);
                String[] hh = name.split("\\.");
                if(hh.length <= 1) return false;
                String suf = hh[1];
                //System.out.println(name);
                return suf.equals("txt");
//                return false;
            }
        });

        for(var txtFile : txtFiles){
            FileReader reader = new FileReader(txtFile);
            File fd = new File("D:\\tmp");
            if(!fd .exists()  && !fd .isDirectory()) fd.mkdir();
            File f = new File("D:\\tmp\\"+txtFile.getName());
            if(!f.exists()) f.createNewFile();
            FileWriter writer = new FileWriter(f);

            int len;
            char[] buf = new char[1024];
            while((len = reader.read(buf)) != -1){
                writer.write(buf);
            }
            System.out.println(txtFile.getName() + "复制完成");
            reader.close();
            writer.close();
        }

    }
}
