# **🎈chapter 10 자바 기본 클래스**

## 🔎 Object 클래스

> 모든 클래스의 최상위 클래스<br>java.lang.Object 클래스
>
> 모든 클래스는 Object 클래스에서 상속 받음<br>모든 클래스는 Object 클래스의 메서드를 사용할 수 있음<br>모든 클래스는 Object 클래스의 일부 메서드를 재정의 하여 사용할 수 있음

</br>

## 🔎 toString() 메서드

> toString() 메서드의 원형
>
> ㄱ
>
> 객체의 정보를 String으로 바꾸어 사용할 때 유용함<br>자바 클래스 중에는 이미 정의된 클래스가 많음
>
> > 예 : String, Integer, Calendar 등
>
> 많은 클래스에서 재정의하여 사용

</br>

## 🔎 equals() 메서드

> 두 객체의 동일함을 논리적으로 재정의 할 수 있음
>
> 물리적 동일함 : 같은 주소를 가지는 객체<br>논리적 동일함 : 같은 학번의 학생, 같은 주문 번호의 주문
>
> 물리적으로 다른 메모리에 위치한 객체라도 논리적으로 동일함을 구현하기 위해 사용하는 메서드

</br>

## 🔎 hashCode() 메서드

> hashCode() 메서드의 반환 값 : 인스턴스가 저장된 가상머신의 주소를 10진수로 반환
>
> 두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하다는 것은?
>
> > 논리적으로 동일 : equals() 의 반환값이 true<br>동일할  hashCode 값을 가짐 : hashCode() 의 반환 값이 동일

</br>

## 🔎 clone() 메서드

> 객체의 복사본을 만듦<br>기본 틀(rototype)으로 부터 같은 속성 값을 가진 객체의 복사본을 생성할 수 있음<br>객체지향 프로그래밍의 정보은닉에 위배되는 가능성이 있으므로 복제할 객체는 cloneable 인터페이스를 명시해야 함
>

![image-20210314182751500](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210314182751500.png)

**💡 implements Cloneable 복제 가능한 클래스라는 것을 명시해줌**

</br>

## 🔎 Class() 메서드

> 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성됨<br>class 파일에는 객체의 정보 (멤버변수, 메서드, 생성자 등) 가 포함되어 있음<br>Class 클래스는 컴파일 된 class 파일에서 객체의 정보를 가져올 수 있음
>

</br>

## 🔎 Class 클래스 가져오기

> 동적로딩을 할 때 주로 사용 많이한다.

```java
String s = new String();
Class c = s.getClass();

Class c = String.Class;

Class c = Class.forName("java.lang.String"); //동적 로딩
```

</br>

> 장점 : "java.lang.String"을 필요한 lib로 변경 가능하다.
>
> 단점 : 오타가 난다면 로딩 중에 오류가 날 수 있다.

</br>

## 🔎 reflection 프로그래밍

> Class 클래스로부터 객체의 정보를 가져와 프로그래밍 하는 방식
>
> 로컬에 객체가 없고 자료형을 알 수 없는 경우 유용한 프로그래밍
>
> java.lang.reflect 패키지에 있는 클래스 활용

</br>

## 🔎 forName() 메서드와 동적로딩

> Class 클래스 static 메서드
>
> 동적로딩이란 ? 컴파일 시에 데이터 타입이 모든 biding 되어 자료형이 로딩되는 것(static lodin)이 아니라 실행 중에 데이터 타입을 알고 bindin되는 방식
>
> 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함
>
> 컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외(ClassNotFoundException)이 발생할 수 있음

</br>

## 🔎 String, Wrapper 클래스

> 동적로딩이란 ? 컴파일 시에 데이터 타입이 모든 biding 되어 자료형이 로딩되는 것(static lodin)이 아니라 실행 중에 데이터 타입을 알고 bindin되는 방식
>
> 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함







🌵🔥🌪️🌹🌻🍀🌱💻💡💣💊🎈🧷🔍🔎📌📍🎁🔑🗝️⏱️❓❗⭐

0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🔼🔽➡️⬅️〰️➰➿🎵🎶❌🚫💢

