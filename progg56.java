package com.tap.package1;

		abstract class Plane
		{
			abstract void takeoff();
			abstract void fly();
			abstract void land();
		}
		 class cargoPlane extends Plane
		{
			void takeoff()
			{
				System.out.println("cargoplane takeoffs at longer runways");
			}
			
			void fly()
			{
				System.out.println("cargoplane flies at lower heights");
			}
			
			void land()
			{
				System.out.println("cargoplane land at longer runways");
			}
		}
		 class passengerPlane extends Plane
		 {
				void takeoff()
				{
					System.out.println("passenger takeoffs at shorter runways");
				}
				
				void fly()
				{
					System.out.println("passenger flies at medium heights");
				}
				
				void land()
				{
					System.out.println("cargoplane land at shorter runways");
				}
			}
		 class fighterPlane extends Plane
		 {
				void takeoff()
				{
					System.out.println("fighterplane takeoffs at medium runways");
				}
				
				void fly()
				{
					System.out.println("fighter flies at higher heights");
				}
				
				void land()
				{
					System.out.println("fighter land at medium runways");
				}
			}
		 
		 class Airport
		 {
			 void visa(Plane ref)
			 {
				 ref.takeoff();
				 ref.fly();
				 ref.land();
			 }
			 
		 }
		 
		 
		 public class progg56 {

				public static void main(String[] args) {
					cargoPlane cp=new cargoPlane();
					passengerPlane pp=new passengerPlane();
					fighterPlane fp=new fighterPlane();
					
					Airport a=new Airport();
					a.visa(cp);
					a.visa(pp);
					a.visa(fp);

	}

}
