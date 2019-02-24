
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.management.HotspotInternal;

public class Baglanti {

    private String kAdi = "root";
    private String sifre = "";
    private String dbAdi = "demo";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pstatement = null;

    public void preparedCalisenleriGetir(int id, String adi) {
        String sorgu = "select * from calisanlar where id>? and ad like ?";
        try {
            pstatement = con.prepareStatement(sorgu);
            pstatement.setInt(1, id);
            pstatement.setString(2, adi);

            ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                System.out.println(" Ad : " + ad + " Soyad : " + soyad + " E-mail : " + email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanlariGetir() {
        String sorgu = "Select * From calisanlar";//sorgumuzu yazdık
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);//sorgumuzu çalıştırdık rs ye dönen değerleri atadık.
            while (rs.next()) {//veriler bitene kadar dön
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                System.out.println("Id : " + id + " Ad : " + ad + " Soyad : " + soyad + " E-mail : " + email);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanEkle() {
        try {
            statement = con.createStatement();
            String ad = "Ayşe";
            String soyad = "ÖZBAY";
            String email = "sdfsaf@sdffd.com";
            String sorgu = "insert into calisanlar (ad,soyad,email) values('" + ad + "','" + soyad + "','" + email + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanGuncelle() {
        try {
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email='rempele@gmail.com' where id=1";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void calisanSil() {
        try {
            statement = con.createStatement();
            String sorgu = "Delete  from calisanlar where id>3";
            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Baglanti() {

        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbAdi + "?useUnicode=true&characterEncoding=utf8";//bağlanti cümleciği
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }
        try {
            con = DriverManager.getConnection(url, kAdi, sifre);
            System.out.println("Veritabanına bağlanıldı");
        } catch (SQLException ex) {
            System.out.println("Veritabanına bağlanılamadı");
        }

    }

    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        // System.out.println("Güncellemeden önce");
        baglanti.preparedCalisenleriGetir(0, "%e");
        //baglanti.calisanSil();
        System.out.println("Güncellemeden sonra");
        // // baglanti.calisanlariGetir();
        //baglanti.calisanGuncelle();
        // baglanti.calisanEkle();

    }
}
