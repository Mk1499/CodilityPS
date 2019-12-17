public class Task2 {
    public static void main(String[] args) {
        String s = "my.song..mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b";
        System.out.println(solution(s));
//        String s5 = "kk.fg.io";
//        String a[] = s5.split("\\.",5);
//        System.out.println(a[0]);

    }

    public static  String solution(String S) {
        // write your code in Java SE 8
        String s = "";
        int musicSize= 0 ;
        int imgSize= 0 ;
        int moviesSize= 0 ;
        int otherSize= 0 ;

        String[] lines = S.split(System.getProperty("line.separator"));
        for (int i = 0; i < lines.length; i++) {
            String[] ex = lines[i].split("\\.");
            String [] exten = ex[ex.length-1].split(" ");
            if (exten[0].equals("mp3") || exten[0].equals("aac") || exten[0].equals("flac"))
                musicSize += Integer.parseInt(exten[1].replace('b',' ').trim()) ;
            else if (exten[0].equals("jpg") || exten[0].equals("bmp") || exten[0].equals("gif"))
                imgSize += Integer.parseInt(exten[1].replace('b',' ').trim()) ;
            else if (exten[0].equals("mp4") || exten[0].equals("avi") || exten[0].equals("mkv"))
                moviesSize += Integer.parseInt(exten[1].replace('b',' ').trim()) ;
            else
                otherSize += Integer.parseInt(exten[1].replace('b',' ').trim()) ;



        }


        s = "music "+musicSize+"b\n"+
             "images "+imgSize+"b\n"+
             "movies "+moviesSize+"b\n"+
             "other "+otherSize+"b\n";
        return s;
    }
}
