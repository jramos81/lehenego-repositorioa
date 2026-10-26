package hiruMarran;

import java.util.Scanner;

public class HiruMarran {

	public static void main(String[] args) {
		
		int posizioa[]=new int[2];
		int jokaldiak=1;
		boolean irabazi=false;
		boolean okupatuta=false;
		Scanner sc=new Scanner(System.in);
		
		//Sortzen dugu jokalekua
		char jokua [][]= new char [3][3];
		//Erakusten dugu jokalekua
		System.out.println("   0 1 2");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==0) {
					System.out.print(i+" |");
				}
				System.out.print("_|");
			}
			System.out.println();
		}
		System.out.println();
		
		while(jokaldiak<10) {
			
			System.out.println("X txanda da");
			System.out.println("Sartu koordenada...");
			do {
				for(int i=0;i<2;i++) {
					if(i==0) {
						System.out.print("Lerroa: ");
					}else System.out.print("Zutabea: ");
					posizioa[i]=sc.nextInt();
				}
				if(jokua[posizioa[0]][posizioa[1]]=='O'||jokua[posizioa[0]][posizioa[1]]=='X') {
					System.out.println("Gela okupatuta!");
					okupatuta = true;
				}else okupatuta=false;
			}while(okupatuta==true);
			
			jokua[posizioa[0]][posizioa[1]]='X';
			jokaldiak++;
			if (jokaldiak ==10) {
				break;
			}
			
			System.out.println("   0 1 2");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(j==0) {
						System.out.print(i+" |");
					}
					if(jokua[i][j]==' ') {
						System.out.print("_|");
					}else System.out.print(jokua[i][j]+"|");
					
				}
				System.out.println();
			}
			
			//Irabazlearen konprobazioa Lerroka
			int lerroa1=0, lerroa2=0, lerroa3=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(jokua[i][j]=='X') {
						if(i==0) {
							lerroa1++;
						}else if(i==1) {
							lerroa2++;
						}else lerroa3++;
					}
				}
			}
			if(lerroa1==3||lerroa2==3||lerroa3==3) {
				System.out.println("X-ak Irabazi du!");
				irabazi=true;
				break;
			}
			
			//Irabazlearen konprobazioa Zutabeka
			int zutabe1=0, zutabe2=0, zutabe3=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(jokua[j][i]=='X') {
						if(i==0) {
							zutabe1++;
						}else if(i==1) {
							zutabe2++;
						}else zutabe3++;
					}
				}
			}
			if(zutabe1==3||zutabe2==3||zutabe3==3) {
				System.out.println("X-ak Irabazi du!");
				irabazi=true;
				break;
			}
			
			//Diagonalak aztertu
			if(jokua[1][1]=='X') {
				if(jokua[0][0]=='X'&&jokua[2][2]=='X') {
					System.out.println("X-ak Irabazi du!");
					irabazi=true;
					break;
				}else if(jokua[0][2]=='X'&&jokua[2][0]=='X') {
					System.out.println("X-ak Irabazi du!");
					irabazi=true;
					break;
				}
			}
			System.out.println();
			System.out.println("O txanda da");
			System.out.println("Sartu koordenada...");
			do {
				for(int i=0;i<2;i++) {
					if(i==0) {
						System.out.print("Lerroa: ");
					}else System.out.print("Zutabea: ");
					posizioa[i]=sc.nextInt();
				}
				if(jokua[posizioa[0]][posizioa[1]]=='O'||jokua[posizioa[0]][posizioa[1]]=='X') {
					System.out.println("Gela okupatuta!");
					okupatuta = true;
				}else okupatuta=false;
			}while(okupatuta==true);
			
			jokua[posizioa[0]][posizioa[1]]='O';
			jokaldiak++;
			if (jokaldiak ==10) {
				break;
			}
			
			System.out.println("   0 1 2");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(j==0) {
						System.out.print(i+" |");
					}
					if(jokua[i][j]==' ') {
						System.out.print("_|");
					}else System.out.print(jokua[i][j]+"|");
					
				}
				System.out.println();
			}
			//Irabazlearen konprobazioa Lerroka
			lerroa1=0;
			lerroa2=0;
			lerroa3=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(jokua[i][j]=='O') {
						if(i==0) {
							lerroa1++;
						}else if(i==1) {
							lerroa2++;
						}else lerroa3++;
					}
				}
			}
			if(lerroa1==3||lerroa2==3||lerroa3==3) {
				System.out.println("O-ak Irabazi du!");
				irabazi=true;
				break;
			}
			
			//Irabazlearen konprobazioa Zutabeka
			zutabe1=0;
			zutabe2=0;
			zutabe3=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(jokua[j][i]=='O') {
						if(i==0) {
							zutabe1++;
						}else if(i==1) {
							zutabe2++;
						}else zutabe3++;
					}
				}
			}
			if(zutabe1==3||zutabe2==3||zutabe3==3) {
				System.out.println("O-ak Irabazi du!");
				irabazi=true;
				break;
			}
			
			//Diagonalak aztertu
			if(jokua[1][1]=='O') {
				if(jokua[0][0]=='O'&&jokua[2][2]=='O') {
					System.out.println("O-ak Irabazi du!");
					irabazi=true;
					break;
				}else if(jokua[0][2]=='O'&&jokua[2][0]=='O') {
					System.out.println("O-ak Irabazi du!");
					irabazi=true;
					break;
				}
			}
			
		}
		if (jokaldiak>=10 && irabazi==false) {
			System.out.println("Ez du inork irabazi! \n Ondo jokatuta!");
		}

	}

}
