package Techeer_partners.Techeer_partners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class TecheerPartnersApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			System.out.println(i);
		}
		SpringApplication.run(TecheerPartnersApplication.class, args);

	}

}
