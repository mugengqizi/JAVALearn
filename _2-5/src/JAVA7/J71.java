package JAVA7;

import java.io.*;

public class J71 {
    static public void z1_2() {
        System.out.println("请输入内容，输入e退出！");

        BufferedReader ir = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/1.txt"));
            for (String str; (str = ir.readLine()) != null; ) {

                if (str.equalsIgnoreCase("e")) {
                    break;
                }
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedReader br1 = null;
        try {
            br1 = new BufferedReader(new FileReader("src/1.txt"));
            String str;
            while ((str = br1.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br1 != null) {
                try {
                    br1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static public void z3(String sourcePath, String targetPath) throws Exception {

        File sourceFile = new File(sourcePath);

        File targetFile = new File(targetPath);
        File[] files = sourceFile.listFiles();
        if (files == null || files.length == 0) {
            return;
        }
        for (File file : files) {
            String movePath = targetFile + File.separator + file.getName();
            if (file.isDirectory()) {
                z3(file.getAbsolutePath(), movePath);
            } else {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(movePath));
                byte[] b = new byte[1024];
                int temp = 0;
                while ((temp = in.read(b)) != -1) {
                    out.write(b, 0, temp);
                }
                out.close();
                in.close();
            }
        }
    }
}


