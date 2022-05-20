package sample_ex;


class Updater {
    void update(Counter count) {
    	count.count++;
    }
}


class Counter {
    int count = 0;  // 객체변수
}


class CalculatorRedefine {
   int result = 0;

   int add(int num) {
        result += num;
        return result;
    }
   
   int sub(int num) {
       result -= num;
       return result;
   }
}


class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

//class HouseDog extends Dog {
class HouseDog extends Animal {
	
    HouseDog(String name) {
        this.setName(name);
    }
    
    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
    
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

class Bouncer {
    void barkAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("어흥");
        } else if (animal instanceof HouseDog) {
            System.out.println("으르렁");
        }
    }
}


public class sample02_class {
	   // 합계
	   int sum(int a, int b) {
	        return a + b;
	    }

	    String say() {
	        return "Hi";
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorRedefine cal1 = new CalculatorRedefine();  // 계산기1 객체를 생성한다.
		CalculatorRedefine cal2 = new CalculatorRedefine();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
        

        Animal cat = new Animal();
        cat.setName("boby");

        Dog dog = new Dog();
        
        dog.setName("happy");
        

        System.out.println(cat.name);
        System.out.println(dog.name);
        
        System.out.println(cat == dog);
        System.out.println(cat.name == dog.name);
        System.out.println(cat.name.equals(dog.name));
        
        System.out.println("개이름은 무엇일까? "+ dog.name);  // poppy 출력
        dog.sleep();  // poppy zzz 출력
        
         
        HouseDog happy = new HouseDog("happy");        
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);  // happy 출력
        System.out.println(yorkshire.name);  // yorkshire 출력
        
        // houseDog.setName("happy");
        happy.sleep();  // happy zzz in house 출력
        
        happy.sleep(3);  // happy zzz in house for 3 hours 출력
        
        int a = 3;
        int b = 4;

        sample02_class sample = new sample02_class();
        int c = sample.sum(a, b);

        System.out.println(c);  // 7 출력
        
        String a1 = sample.say();
        System.out.println(a1);  // "Hi" 출력
        
		
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        
        Updater myUpdater = new Updater();
        
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
        
        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(dog);
        bouncer.barkAnimal(happy);
        
	}
	
	

}
