package BrandPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BMain {
	
	private ArrayList<Brand> a = new ArrayList<Brand>();
	Brand a1 = new Brand(101,"Levis",50,1115);
	Brand a2 = new Brand(102,"Lee",26,965);
	Brand a3 = new Brand(103,"Wrangler",37,1525);
	Brand a4 = new Brand(104,"Spykar",61,899);
	Brand a5 = new Brand(105,"Diesel",78,1675);
	Brand a6 = new Brand(106,"Denizen",18,1245);
	Brand a7 = new Brand(107,"Flying Machine",29,750);
	Brand a8 = new Brand(108,"Numero Uno",43,499);
	Brand a9 = new Brand(109,"Burberry",55,856);
	Brand a10 = new Brand(110,"Pepe Jeans",31,1399);
	
	private double cost=0;
	public static void main(String[] args) {
		int ch = 0;
		int id,n,k,j=0;
		double amount;
		Scanner sc = new Scanner(System.in);
		
		BMain b = new BMain();
		b.createList();
		
		b.display();
		
		System.out.println("Enter all the brands to create your pack!");
		do {
				System.out.println("Enter the no of brands to create your pack");
				n=sc.nextInt();
				if(n<11)
				{
						while(j<n)
						{
								System.out.println("Enter the brand id of the brand to be added to your pack: ");
								id=sc.nextInt();
								k=b.searchBrand(id);
								if(k>=0)
								{
											if(id==b.a.get(k).getBrand_id()) 
											{
												b.updateCostAndFrequency(k);	
												j+=1;
											}
								}
								else
								{
										System.out.println("enter valid choice!");
										
								}
						}
						b.cost=b.discountCalc(n, b.cost);
						System.out.println("enter amount to be paid");
						amount=sc.nextDouble();
						while(amount!=b.cost)
						{	
								System.out.println("error:enter valid amount reenter");
								amount=sc.nextDouble();
						}
						System.out.println("Successfull !!");
						b.display();		
				}
				else
				{
						System.out.println("Brand range out of bound");
				}
				System.out.println("Do u want to continue(1=yes and 0=no)");
				ch=sc.nextInt();
			}while(ch!=0);
			System.out.println("Thank you!");
		
	}
	void createList() {
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a6);
		a.add(a7);
		a.add(a8);
		a.add(a9);
		a.add(a10);
		
	}
	
	void display() {
		Collections.sort(a,new Brand());
		System.out.println("Id   Name    Rank  Cost");
		
		for(Brand i:a) {
			System.out.println(i.toString());
		}
		
	}
	
	int searchBrand(int id) {
		int flag=0,k;
		for(k=0;k<10;k++) {
			if(id==a.get(k).getBrand_id()) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			return k;
		else
			return -1;
	}
	
	void updateCostAndFrequency(int k) {
		
		cost=cost+a.get(k).getBrand_cost();
		System.out.println("cost"+cost);
		int cou = a.get(k).getFrequency();
		cou+=1;
		a.get(k).setFrequency(cou);
		
	}
	
	double discountCalc(int n,double cost) {
		double discount=cost;
		if(n<=2)
		{
				discount=cost;
				System.out.println("No Discount and amount is: "+discount);
		}
		else if(n==3 || n==4)
		{
				discount=cost-cost*0.05;
				System.out.println("discounted amount is "+discount);
		}
		else if(n==5 || n==6)
		{
				discount=cost-0.1*cost;
				System.out.println("discounted amount is "+discount);
		}
		else if(n>6)
		{
				discount=cost-0.2*cost;
				System.out.println("discounted amount is "+discount);
		}
		return discount;
	}
	
	public ArrayList<Brand> getA() {
		return a;
	}
	public void setA(ArrayList<Brand> a) {
		this.a = a;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
