import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "admin";
        String pass = "123";

        System.out.print("Username: ");
        String u = input.nextLine();

        System.out.print("Password: ");
        String p = input.nextLine();

        if (u.equals(user) && p.equals(pass)) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}