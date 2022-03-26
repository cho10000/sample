package sample_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class sample01 {
    public void dan(int n) {
        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);

    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample01 gugu = new sample01();
        gugu.dan(2);
        
        System.out.println("새로운 환경을 정의한다.");
        
        String a = "Hello Java";
        String b = new String("Hello Java");
        System.out.println(a.equals(b));  // true
        System.out.println(a == b);  // false 
        System.out.println(a.indexOf("Java"));  
        //indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
        
        System.out.println(a.contains("Java"));  
        // contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다. true 출력
        
        System.out.println(a.charAt(6));  
        // "J" 출력 charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
        
        System.out.println(a.replaceAll("Java", "World"));  
        // Hello World 출력 replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
        
        System.out.println(a.substring(0, 4)); 
        // Hell 출력 substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
        
        System.out.println(a.toUpperCase());  
        // HELLO JAVA 출력 toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용한다.)
        
        
        a = "a:b:c:d";
        String[] result = a.split(":");
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

        // result는 {"a", "b", "c", "d"} split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
        // 변수로 출력하기
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
        System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", 3, 5));
        
        //포맷으로 출력하기
        System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
        System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
        System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
        
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력  리턴 메소드 사용
        System.out.printf("I eat %d apples.\n", 3);  // "I eat 3 apples." 출력                  출력 메소드 사용
        
        //String.format 과 System.out.printf의 차이는 전자는 문자열을 리턴하는 메소드이고 후자는 문자열을 출력하는 메소드
        
        
        //StringBuffer
        
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result1 = sb.toString();
        System.out.println(result1);
        
        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);
        
		/*  //StringBuffer 버퍼가 더 절감된다.
		 첫번 째 예제의 경우 StringBuffer 객체는 한번만 생성된다. 두번 째 예제는 String 자료형에 + 연산이 있을 때마다
		 새로운 String 객체가 생성된다(문자열 간 + 연산이 있는 경우 자바는 자동으로 새로운 String 객체를 만들어 낸다). 두번 째
		 예제에서는 총 4개의 String 자료형 객체가 만들어지게 된다.
		 */
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java");
        sb.insert(0, "hello ");  // insert
        String result3 = sb2.toString();
        System.out.println(result3);
        System.out.println(result3.substring(0, 4));
        
		/*
		 * StringBuffer는 멀티 스레드 환경에서 안전하다는 장점이 있고 StringBuilder는 StringBuffer보다 성능이 우수한
		 * 장점이 있다. 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer 보다는 StringBuilder를 사용하는 것이
		 * 유리하다.
		 */
        
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};  //ArrayIndexOutOfBoundsException
        System.out.println(weeks[3]);
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        
        //import java.util.ArrayList
        // list 방식 관리
        ArrayList pitches = new ArrayList();  //add, get, size, contains, remove
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");	
        
        for (int i=0; i<pitches.size(); i++) {
            System.out.println(pitches.get(i));
        }
        System.out.println(pitches.contains("142")); 
        //contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
        
        System.out.println(pitches.remove("129"));
        //remove 메소드에는 2가지 방식이 있다. (이름은 같지만 입력파라미터가 다르다)
        // remove(객체),  remove(인덱스)
        
        String one = (String) pitches.get(0);
        String two = (String) pitches.get(1);
        System.out.printf("%s  %s \n", one,two);
        System.out.printf("%s  %s", pitches.get(0),pitches.get(1));
        System.out.println(pitches.get(0).getClass().getName());
        
        //java.util.Arrays
        ArrayList<String> pitches1 = new ArrayList<>(Arrays.asList("138", "129", "142"));  //List 초기값 지정
        System.out.println(pitches1);
        
        String result21 = String.join(",", pitches1);
        //String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.
        
        System.out.println(result21);  // 138,129,142 출력
        
        //import java.util.Comparator;
        pitches1.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        // 오름차순(순방향) 정렬 - Comparator.naturalOrder()
        // 내림차순(역방향) 정렬 - Comparator.reverseOrder()
        
        System.out.println(pitches1);  // [129, 138, 142] 출력 
        
        
        //맵 (Map)
        //HashMap put, get, containsKey, remove, size, keySet
        //put key와 value가 String 형태인 HashMap을 만들고 위에서 보았던 예제의 항목값들을 입력해 보자.
        
        //import java.util.HashMap;
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        
        System.out.println(map.get("people"));  // "사람" 출력
        
        System.out.println(map.get("java"));  // null 출력
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력 Default 사용
        
        
        System.out.println(map.containsKey("people"));  // true 출력
        //containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
        
        
        System.out.println(map.remove("people"));  // "사람" 출력
        //remove 메소드는 맵(Map)의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴한다.
        
        System.out.println(map.size());  // 1 출력
        //size 메소드는 Map의 갯수를 리턴한다.
        
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());  // [baseball, people] 출력
        //keySet은 맵(Map)의 모든 Key를 모아서 리턴한다.
        
        //List<String> keyList = new ArrayList<>(map.keySet());  set 집합과 list는 서로  바구어 사용할 수 있다.
        
        
		/*
		 * LinkedHashMap과 TreeMap
		 * 
		 * Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다. 하지만 가끔은 Map에 입력된 순서대로 데이터를
		 * 가져오고 싶은 경우도 있고 때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다. 이런경우에는
		 * LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.
		 * 
		 * LinkedHashMap은 입력된 순서대로 데이터를 저장하는 특징을 가지고 있다. TreeMap은 입력된 key의 오름차순 순서로 데이터를
		 * 저장하는 특징을 가지고 있다.
		 */
        
        
        //집합 (Set)
		/*
		 * Set 자료형
		 * 
		 * Set 자료형에는 HashSet, TreeSet, LinkedHashSet 등의 Set 인터페이스를 구현한 자료형이 있다. 여기서 말하는
		 * Set 자료형은 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.
		 */
        
        //교집합, 합집합, 차집합 구하기
        //import java.util.Arrays;
        // import java.util.HashSet;
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
        
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
        
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
        
        HashSet<String> set = new HashSet<>(); 
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
        
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
        
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));  //값 여러 개 추가하기(addAll)
        System.out.println(set);  // [Java, To, Jump] 출력
        
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
        
        
		/*
		 * TreeSet과 LinkedHashSet
		 * 
		 * Set 자료형은 순서가 없다는 특징이 있다. 하지만 가끔은 Set에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 오름차순으로
		 * 정렬된 데이터를 가져오고 싶을 수도 있을 것이다. 이런경우에는 TreeSet과 LinkedHashSet을 사용한다.
		 * 
		 * TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다. LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는
		 * 특징이 있다.		
		 */
        
        String num = "123";
        int n = Integer.parseInt(num); //형변환
        System.out.println(n);  // 123 출력
        
        num = ""+ n;
        System.out.println(num);
        
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력
        
        
        String num11 = "123.456";
        double d = Double.parseDouble(num11);
        System.out.println(d);
        
        final int n22 = 123;  // final 로 설정하면 값을 바꿀수 없다. 값 고정
        
        final ArrayList<String> a22 = new ArrayList<>(Arrays.asList("a", "b"));
       //리스트의 경우도 final로 선언시 재할당은 불가능하다. 
        //리스트의 경우 final로 선언시 리스트에 값을 더하거나(add) 빼는(remove) 것은 가능하다. 다만 재할당만 불가능할 뿐이다.
       //List.of로 수정이 불가능한 리스트(Unmodifiable List)를 생성해야 한다.
        
       //import java.util.List; 
        final List<String> a33 = List.of("a", "b");
        
        
        // if문의 기본 구조 and(&&), or(||), not(!)    contains     else if (다중 조건 판단)
        // <, >, ==, !=, >=,  <=
        
        boolean money = true;
        if (money) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
        
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {  //  ArrayList    contains
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
        
        // switch/case
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
 
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);

       // while문의 기본 구조
       // while문의 기본 구조  무한루프(Loop):while (true)     while문 빠져 나가기(break)    while문 조건문으로 돌아가기(continue)
        
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
        
        
        int coffee = 10;
        int money1 = 300;

        while (money1 > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
        
        
        // for 
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {  //(초기치; 조건문; 증가치) 
            System.out.println(numbers[i]);
        }
        
        //  String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }
        


        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력 
        
        
        
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }
        
        int americano = countSellCoffee(CoffeeType.AMERICANO);
        System.out.println(americano);
        countSellCoffee(CoffeeType.AMERICANO); 
	}
	
	
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    
    static int countSellCoffee(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(type.AMERICANO, 5);  // 1: 아메리카노
        priceMap.put(type.ICE_AMERICANO, 70);  // 2: 아이스 아메리카노
        priceMap.put(type.CAFE_LATTE, 10);  // 3: 카페라떼
        int count = priceMap.get(type);

        System.out.println(String.format("건수는 %d원 입니다.", count));
        
    	
		return 1;
        
    }

    

}
