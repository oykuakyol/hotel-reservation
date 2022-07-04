package hotelProject;
public class hotelProject {
String name;
int day,month,year,cust,age,date,datef,act,decider,costFinal,costAge;
int cost=0;

public hotelProject(int day,int month,int cust,int age,int date,int datef,int cost){

this.name=name;
this.day=day;
this.month=month;
this.cust=cust;
this.age=age;
this.date=date;
this.datef=datef;
this.cost=cost;
this.act=act;
this.decider=decider;

int i,j;
for(i=0;i<10;i++) {
if(day>2||day<10) {
	continue;
}
else {
	System.out.println("You entered invalid value,please try again.");
	break;
}
	if(year==2022) {
continue;
}
else {
	System.out.println("You entered invalid value,please try again.");
break;
}
if(month==1) {
	System.out.println("For January:05.01.2022-12.01.2022 are full.");
}
else if(month==2) {
		System.out.println("For February:07.02.2022-10.02.2022 are full.");
	}
else if(month==3) {
	System.out.println("For March:18.03.2022-22.03.2022 and 28.03.2022-31.03.2022 are full.");
	}
else if (month==4) {
System.out.println("For April:11.04.2022-15.04.2022 are full.");	
}
else if(month==5) {
	System.out.println("For May all dates are available.");
}
else if(month==6) {
	System.out.println("For June:06.06.2022-12.06.2022 are full.");
}
else if(month==7) {
	System.out.println("\"For June all dates are full,sorry.");
}
else if(month==8) {
	System.out.println("\"For August only 18.08.2022 and 24.08.2022 are available");
}
else if(month==9) {
	System.out.println("For September:12.09.2022-15.09.2022 are full.");
}
else if(month==10) {
	System.out.println("For October all dates are available.");
}
else if(month==11) {
	System.out.println("For November 18.11.2022-21.11.2022 are full. At 10th November, we dont have any entertainment activity.");
}
else if(month==12) {
	System.out.println("For December 26.12.2022-31.12.2022 are full.");
}
else {
	System.out.println("You entered invalid value,please try again.");
	}
if(month==1) {
	if(date>0&&date<32){
		{if(date<5||date>12){
		datef=date+day;
		System.out.println( date+month+year+datef+month+year);
		}
		else{
			System.out.println("You entered wrong date value,please change.");
		}
		}
		}
	else{
		System.out.println("You entered wrong date value,please change.");
}
}
	else if(month==2){
		if(date>0&&date<29){
		{if(date<7||date>10){
		datef=date+day;
		System.out.println(date+month+year+datef+month+year);
		}
		else{
			System.out.println("You entered wrong date value, please change.");
		}
		 }
		  }
		else{
		System.out.println("You entered wrong date value,please change.\n ");
		}
		 }
	else if(month==3){
		if(date>0&&date<32){
		{if((date<18||date>22)&&(date<28||date>31)){
		datef=date+day;
		System.out.println (date+month+year+datef+month+year);
		}
		else{
			System.out.println("You entered wrong date value,please change.");
		}
		}
		 }
		else{
		System.out.println("You entered wrong date value,please change.");
		}

}
		else if(month==4){
			if(date>0&&date<31){
			{if(date<11||date>15){
			datef=date+day;
			System.out.println(date+month+year+datef+month+year);
			}
			else{
				System.out.println("You entered wrong date value, please change.");
				}
			}
			}
			else{
			System.out.println("You entered wrong date value,please change.");
		}
	}
		else if(month==5){
			if(date>0&&date<32){
			{if(date>0&&date<32){
			datef=date+day;
			System.out.println(date+month+year+datef+month+year);
			}
			else{
				System.out.println("You entered wrong date value,please change.\n");
			}
			}
			 }
			else{
			System.out.println("You entered wrong date value,please change.\n");
			}
}
		else if(month==6){
			if(date>0&&date<31){
			{if(date<6||date>12){
			datef=date+day;
			System.out.println( date+month+year+datef+month+year);
			}
			else{
				System.out.println("You entered wrong date value,please change.\n");
			}
			}
			 }
			else if(month==7){
				System.out.println("We are sorry,no available option.\n");
				} 
			} 
		else if(month==8){
			if(date>0&&date<32){
			{if(date<18||date>24){
			datef=date+day;
			System.out.println(date+month+year+datef+month+year);
			}
			else{
				System.out.println("You entered wrong date value,please change.\n");
			}
			}
			 }
			else if(month==9){
				if(date>0&&date<31){
				{if(date<12||date>15){
				datef=date+day;
				System.out.println( date+month+year+datef+month+year);
				}
				else{
					System.out.println("You entered wrong date value,please change.\n");
				}
				 }
				  }
				else if(month==10){
					if(date>0&&date<32){
					System.out.println("All dates are available");
					}
					else {
					System.out.println("You entered wrong date value,please change.");
					}
			}
				else if(month==11){
					if(date>0&&date<31){
				{if(date<18||date>21){
				datef=date+day;
				System.out.println( date+month+year+datef+month+year);
				}
				else{
					System.out.println("You entered wrong date value,please change. ");
				}
				}
				 }
				else if(month==12){
					if(date>0&&date<32){
					{if(date<26||date>31){
					datef=date+day;
					System.out.println( date+month+year+datef+month+year);
					}
					else{
					System.out.println("You entered wrong date value,please change.\n");
								}
					 }
					  }
					}
if(cust>0&&cust<10) {
	for (i=0;i<cust;i++) {
		continue;
	}
}
	else{
			System.out.println("You entered invalid value please change");
		}
int costFinal1,costFinal2,costFinal3;
	for(i=0;i<cust;i++) {
		if(age<8) {
		System.out.println("this persons cost is free.");	
		costAge=0;
		costFinal1=(costAge*day);
			}
		else if(8<=age&&age<=16){
			System.out.println("This persons cost is 500 tl.\n");
			costAge=500;
			costFinal2=(costAge*day);
					}	
		else {
	System.out.println("this persons cost is 1000 tl");
		costAge=1000;
		costFinal3=(costAge*day);
		}
	costFinal=costFinal1+costFinal2+costFinal3;
	}
int costRoom,costFinal4,costFinal5,costFinal6;
if(decider==1) {
	System.out.println("You choose golden type room.Extra 500tl for every people.");
costRoom=(cust*500);
costFinal4=costRoom+costFinal;

}
else if(decider==2) {
	System.out.println("you choose lux type room.Extra 250 tl for every people");
costRoom=(cust*250);
costFinal5=costRoom+costFinal;
}
else {
	System.out.println("you choose normal type room.");
costFinal6=costFinal+0;
				}
			costFinal=costFinal4+costFinal5+costFinal6;
				System.out.println("current fee="+costFinal);
				}
			}
}
}
if(month==1||month==2){

	for(int t=0;t<cust;t++){
System.out.println("You chose winter season.");
System.out.println("Our hotel serves special activities in winter.");
System.out.println("Please choose your activity:");
int k=0;
System.out.println("1-Yes, I want to\n 2-No I dont want to\n");

if(k==1){
System.out.println("Our activities are: 1-skiing-200tl 2-ice skating-150tl 3-Snowman festival-50tl (prize :300tl) ");

if(act==1){System.out.println(" This activity costs 200tl");
costFinal=costFinal+200;
}
else if(act==2) 
{System.out.println("150tl");
costFinal=costFinal+150;}
else if(act==3){System.out.println("300tl\n");
costFinal=costFinal+300;
}
else{System.out.println("No activity, this option is done\n");
}
 }
  } 
   }
else if(month==3){
	for(int c=0;c<cust;c++){
	int h=0;
	System.out.println("You chose march month in spring season.\n");
	System.out.println("As special we have nevrous bairam for 5 days.this is a imporant day in turkish culture.\n");
	System.out.println("1-Yes y want 2-No y dont want");

if(h==1){System.out.println("cost =150");
costFinal=costFinal+150;
}
else{System.out.println("cost =0 tl for this");
costFinal=costFinal+0;
}
 }
}
else if(month==4||month==5){
for(int y=0;y<cust;y++){
	System.out.println("You chose spring season.\n");
	System.out.println("Our hotel serves special activities in spring.\n");
	System.out.println("Please choose your activity:");
int g=0;
System.out.println("1-Yes, y want 2-No y dont want");
if(g==1){
	System.out.println("Our activities are: 1-bicycle tour-75tl 2spring tea festival-90tl 3-picnic 100tl ");

if(act==1){System.out.println(" This activity costs 75tl");
}
else if(act==2) 
{System.out.println("90tl");
costFinal=costFinal+90;
}
else if(act==3){
	System.out.println("100tl\n");
costFinal=costFinal+100;
}
else{System.out.println("No activity, this option is done\n");
}
 }
}
}
else if(month==6||month==7||month==8){
for(int w=0;w<cust;w++){
	System.out.println("You chose summer season\n");
	System.out.println("Our hotel serves special activities in summer.\n");
	System.out.println("pls choose your act:");
int z=0;
System.out.println("1-Yes y want 2-No, y dont want\n");

if(z==1){
	System.out.println("Our activities are: 1-Beach volleyball tournament-75tl(prize is cup and medal) 2-Banana activity in sea -150tl 3-scuba diving 200tl ");

if(act==1){
	System.out.println(" This activity costs 75tl");
costFinal=costFinal+75;
}
else if(act==2) 
{System.out.println("150tl");
costFinal=costFinal+150;
}
else if(act==3){System.out.println("200tl\n");
costFinal=costFinal+200;}
}
else{System.out.println("No activity, this option is done -0 tl\n");
}
 }
  }
else if(month==9||month==10||month==11){
for(int q=0;q<cust;q++){
	System.out.println("You chose autumn season\n");
	System.out.println("Our hotel serves special activities in autumn.\n");
	System.out.println("pls choose your act:");
int a=0;
System.out.println("1-Yes ,y want 2-No, y dont want\n");

if(a==1){
	System.out.println("Our activities are: 1-atm tour-175tl 2-trekking -80tl 3-dance tournamnet about autumn 50tl(prize is medal)\n ");

if(act==1){System.out.println(" this activity costs 175tl\n");
}
else if(act==2) 
{System.out.println("80tl");
costFinal=costFinal+80;
 }
else if(act==3){System.out.println("50tl\n");
costFinal=costFinal+50;
}
 }
else{System.out.println("no act this option is done -0 tl\n");
}
 }
  }
  int costcr=0;
  costFinal=costFinal+costcr;
  System.out.println("costfinal=%d"+costFinal);
}
   }




