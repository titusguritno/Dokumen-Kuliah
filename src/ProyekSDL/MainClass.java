package proyekSdl;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Pelanggan> antre = new Queue<Pelanggan>();
        Pelanggan[] p = new Pelanggan[0];
        int first = 0, last = 0;
        int menu;

        do {
            System.out.println("===========================================");
            System.out.println("\t\t  MENU");
            System.out.println("===========================================");
            System.out.println("[1]. INPUT DATA");
            System.out.println("[2]. TAMPIL DATA");
            System.out.println("[3]. EDIT DATA");
            System.out.println("[4]. HAPUS DATA");
            System.out.println("[5]. EXIT");
            System.out.print("PILIH >> ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    last++;
                    System.out.println();
                    p = add(p);
                    p[p.length - 1] = new Pelanggan();
                    p[p.length - 1].setNoPemesanan(String.valueOf((int) Math.ceil(Math.random() * 100)));
                    System.out.print("Nama \t\t\t: ");
                    p[p.length - 1].setNama(in.next());
                    do {
                        System.out.print("No handphone \t\t: ");
                        p[p.length - 1].setNoHp(in.next());
                    } while (p[p.length - 1].getNoHp().length() != 12
                            || p[p.length - 1].getNoHp().replaceAll("[0-9]", "").length() != 0);
                    System.out.print("Alamat \t\t\t: ");
                    p[p.length - 1].setAlamat(in.next());
                    System.out.print("Nama Barang \t\t: ");
                    p[p.length - 1].setNamaBrg(in.next());

                    do {
                        System.out.print("Jumlah Barang \t\t: ");
                        p[p.length - 1].setJumlahBarang(in.next());
                    } while (p[p.length - 1].getJumlahBarang().replaceAll("[0-9]", "").length() != 0);

                    do {
                        System.out.print("Harga Barang \t\t: ");
                        p[p.length - 1].setHarga(in.next());
                    } while (p[p.length - 1].getHarga().replaceAll("[0-9]", "").length() != 0);

                    System.out.print("Metode Pembayaran \t: ");
                    p[p.length - 1].setMetodePembayaran(in.next());
                    antre.enqueue(p[p.length - 1]);
                    break;
                case 2:
                    if (antre.isEmpty()) {
                        System.out.println();
                        System.out.println("Tidak ada Data Konsumen");
                    } else {
                        System.out.println();
                        antre.cetak();
                    }
                    break;
                case 3:
                    if (antre.isEmpty()) {
                        System.out.println("Tidak Ada Data Konsumen");
                    } else {
                        System.out.println();
                        System.out.println("Daftar Nomor Pemesanan : ");
                        System.out.println();
                        for (int i = first; i < last; i++) {
                            System.out.println(p[i].getNoPemesanan());
                        }
                        System.out.println();
                        System.out.print("Masukkan nomor pemesanan :  ");
                        menu = in.nextInt();
                        for (int x = 0; x < p.length; x++) {
                            if (menu == Integer.valueOf(p[x].getNoPemesanan())) {
                                System.out.println();
                                System.out.println("Data yang ingin di edit : ");
                                System.out.println("[1]. Nama");
                                System.out.println("[2]. No Handphone");
                                System.out.println("[3]. Alamat");
                                System.out.print("Pilih >> ");
                                menu = in.nextInt();
                                switch (menu) {
                                    case 1:
                                        System.out.print("Edit Nama : ");
                                        p[x].setNama(in.next());
                                        break;
                                    case 2:
                                        System.out.print("Edit No Handphone : ");
                                        p[x].setNoHp(in.next());
                                        break;
                                    case 3:
                                        System.out.print("Edit Alamat : ");
                                        p[x].setAlamat(in.next());
                                        break;
                                }
                            } else {
                                System.out.println("Nomor Pemesanan Tidak Tersedia!!!");
                            }
                        }
                    }
                    break;
                case 4:
                    if (antre.isEmpty()) {
                        System.out.println("Tidak Ada Data");
                    } else {
                        first++;
                        antre.dequeue();
                    }
                    break;
                case 5:
                    System.out.println("===========================================");
                    System.out.println("\t      TERIMAKASIH :)");
                    System.out.println("===========================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("===========================================");
                    System.out.println("     INPUT YANG ANDA MASUKAN SALAH!!!");
                    break;
            }

        } while (menu != 5);
        in.close();
    }

    public static Pelanggan[] add(Pelanggan[] a) {
        Pelanggan[] add = new Pelanggan[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            add[i] = new Pelanggan();
            add[i] = a[i];
        }
        return add;
    }
}
