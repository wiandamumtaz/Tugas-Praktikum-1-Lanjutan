package tugas.praktikum.pkg1.lanjutan;
public class TugasPraktikum1Lanjutan {

    public static void main(String[] args) {
    // untuk membuat panjang persegi yang berjumlah 4 bintang.
        for(int i=1;i<=4;i++)
    {
        //untuk membuat lebar persegi yang berjumlah 4 bintang, dapat dilihat dari j yang dimulai dari 0 sampai 3 (0, 1, 2, 3) jumlahnya 4.
        for(int j=0;j<=3;j++)
        {
            //jika i berada di baris 1 atau i berada di baris 4, maka akan mencetak (@ mendatar). Sementara jika j berada di baris 0 atau j berada di baris 3 maka akan mencetak (@ menurun).
            if(i==1||i==4||j==0||j==3)
            {
                System.out.print("@");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    }
    
}
