# **🎈chapter 05** 클래스와 객체

</br>

## 🔎 객체란 무엇인가

### 📌 객체 (Object)

- 의사나 행위가 미치는 대상(사전적의미)
- 구체적, 추상적 데이터의 단위

예) 사람, 자동차, 주문, 생산, 관리

 </br>

## 🔎 객체 지향 프로그래밍이란?

### 📌 객체 지향 프로그래밍(Object oriented Programming : OOP)

- 객체를 기반으로 하는 프로그래밍
- 객체를 정의하고, 객체의 기능을 구현하며, 객체간의 협력(cooperation)을 구현

### 📌 Cf.절차 지향 프로그래밍 (Procedural Programming)

- 시간이나 사건의 흐름에 따른 구현
- C언어

</br>

## 🔎 클래스(class)

- 체를 코드로 구현한 것
- 객체지향 프로그래밍의 가장 기본 요소
- 객체의 청사진(blueprint)

</br>

## 🔎 멤버변수, 메서드

📌 멤버 변수

- 객체가 가지는 속성을 변수로 표현
- 클래스의 멤버변수
- member variable, property, attribute

📌 메서드

- 객체의 기능을 구현
- method, member function

</br>

## 💻 실습 - Student.java

### 💡 public - 접근 제어자

* 생성한 파일명과 class의 public class 명이 동일해야한다.

### 💡 함수 void <- 반환을 하는 데이터 타입

</br>

## 클래스 정의하기

> 학생이 있습니다. <br>학생은 학번 이름 주소값을 가집니다. <br>학생의 정보를 보여줍니다. <br>학생에 대한 클래스를 구현해 보세요
>

</br>

## 클래스 사용하기

#### 클래스 생성하기

> new 키워드를 사용하여 생성자로 생성<br>Student studentLee = new Student();
>

### 클래스의 속성, 메서드 참조하기

> 생성에 사용한 변수(참조변수)로 클래스의 속성, 메서드 참조<br>studentLee.studentName = "Lee";<br>studentLee.showStudentInfo();
>

### public클래스

자바 파일 하나에 여러개의 클래스가 존재 할 수 도 있음<br>단, public 클래스는 하나이고, public 클래스와 자바 파일 이름은 동일해야한다.

![image-20210305110449001](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305110449001.png)

![image-20210305110526214](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305110526214.png)

------------------------------------------

</br>

## 🔎 함수란 무엇인가요?

### 📌 함수(function)

- 하나의 기능을 수행하는 일련코드
- 함수는 호출하여 사용하고 기능이 수행된 후 값을 반환 할 수 있음
- 함수로 구현된 기능은 여러곳에서 호출되어 사용될 수 있음

</br>

## 💻 실습 - FunctionTest.java.

### 💡 매개변수가 필요 없이 public static int 로 return을 한다.

### 💡  int num = sayHello("안녕하세요");	<- void로 반환하는 것이 없기 때문에 에러난다. 
		sayHello("안녕하세요");

</br>

### 함수 정의하기

함수는 이름, 매개변수, 반환 값, 함수 몸체(body)로 구성됨

```java
int add(int num1, int num2){
    int result;
    result = num1 + num2;
    return result;
}
```

![image-20210305111910120](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305111910120.png)

</br>

------------------------------------

</br>

## 🔎 메서드 (method)

- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수

- 메서드를 구현함으로써 객체의 기능이 구현 됨

- 메서드의 이름은 사용하는 쪽 (클라이언트 코드) 에 맞게 명명하는 것이 좋음

  예) getStudentName() (camel notation)

</br>

## 💡 칼메로테이션

> public String getStudentNume() <- 낙타의 등과 같다해서 **카멜로테이션**
>
> **클래스 명**은 **대문자**로 **패키지 명**은 **소문자** 시작하는게 좋고.
>
> **변수와 메서드 명**은 **소문자로 시작해서 대문자를 중간중간 하는 것**이 좋다.

</br>

-----------------------------

</br>

## 🔎 인스턴스

> 클래스로 부터 생성된 객체<br>힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성<br>클래스 기반으로 new 키워드를 이용하여 여러 개의 인스턴스를 생성
>

![image-20210305114358818](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305114358818.png)

| 용어      | 설명                                        |
| --------- | ------------------------------------------- |
| 객체      | 객체 지향 프로그램의 대상, 생성된 인스턴스  |
| 클래스    | 객체를 프로그래밍하기 위해 코드로 만든 상태 |
| 인스턴스  | 클래스가 메모리에 생성된 상태               |
| 멤버 변수 | 클래스의 속성, 특성                         |
| 메서드    | 멤버변수를 이용하여 클래스의 기능을 구현    |
| 참조 변수 | 메모리에 생성된 인스턴스를 가리키는 변수    |
| 참조 값   | 생성된 인스턴스의 메모리 주소 값            |

</br>

---------------

</br>

## 🔎 생성자 (constructor)

> 객체를 생성할 때 new 키워드와 함께 호출 (객체 생성 외에는 호출할 수 없음)<br>인스턴스를 초기화 하는 코드가 구현됨(주로 멤버 변수 초기화)<br>반환값이 없음, 상속되지 않음<br>생성자는 클래스 이름과 동일
>

</br>

## 🔎 기본 생성자 (default constructor)

> 하나의 클래스에는 반드시 하나 이상의 생성자가 존재해야함<br>프로그래머가 생성자를 구현하지 않으면 컴파일러가 생성자 코드를 넣어줌<br>=> 기본 생성자
>
> 기본생성자는 매개변수가 없고, 구현부가 없음<br>만약 클래스에 다른 생성자가 있는 경우 디폴트 생성자는 제공되지 않음.
>

</br>

### 💡private 선언한 것은 내부에서만 사용하고 외부에서는 사용 할 수 없다.

</br>

--------

</br>

## 🔎 참조 자료형 (reference data type)

> 변수의 자료형
>
> - 기본 자료형 int, long, float, double 등
> - 참조 자료형 String Data, Student 등
>
> 클래스형으로 변수를 선언함
>
> ​	String name;
>
> 기본 자료형은 사용하는 메모리가 정해져 있지만, 참조 자료형은 클래스에 따라 다름

![image-20210305144508628](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305144508628.png)

![image-20210305144533941](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305144533941.png)

![image-20210305144553347](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305144553347.png)

</br>

-------

</br>

## 🔎 접근 제어자 (access modifier)

> 변수, 메서드, 생성자에 대한 접근 권한 지정<br>public, private, protected, 아무것도 안쓰는 경우(기본 접근 제어자)<br>private을 사용하면 클래스 외부에서는 접근 할 수 없음
>

![image-20210305145749610](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305145749610.png)

</br>

## 🔎 정보 은닉 (information hiding)

> 외부에서 클래스 내부의 정보에 접근하지 못하도록 함<br>private 키워드 활용<br>pirivate변수를 외부에서 접근하게 하려면 public 메서드 제공함<br>클래스 내부 데이터를 잘못 사용하는 오류를 방지 할 수 있음.
>

![image-20210305150239107](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305150239107.png)

하나하나 입력하기 번거롭기 때문에 자동 입력을 할 수 있는 기능 **Generate Getters and Setters...** 버튼을 누른다. (코드 창에서 오른쪽 클릭 - Source - Generate Getters and Setters...)

![image-20210305150622597](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305150622597.png)

![image-20210305150702912](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305150702912.png)

**필요한 get set 을 체크한 후 Generate 버튼을 누른다.**

![image-20210305150725075](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210305150725075.png)

자동 입력이 된 것을 확인 할 수 있다.

</br>

-------------------

</br>

## 🔎 this의 역활

> 자신의 메모리를 가리킴<br>생성자에서 다른 생성자를 호출 함<br>인스턴스 자신의 주소를 반환
>

![image-20210306112048880](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210306112048880.png)

</br>



------

## 💻실습





--------

</br>

## 🔎static 변수

> 여러 인스턴스가 하나의 값을 공유할 필요가 있음<br>static 변수는 처음 프로그램이 프로 될 때 데이터 영역에 생성 됨<br>인스턴스의 생성과 상관없이 사용할 수 있으므로 클래스 이름으로 참조<br>클래스 변수, 정적 변수라고도 함.
>

</br>

### 💡static 변수 안에 인스턴스 변수를 사용할 수 없음 !

</br>

### 🔎프로그램에서 변수의 유형

| 변수 유형                      | 선언 위치                                   | 사용범위                                                     | 메모리      | 생성과 소멸                                                  |
| ------------------------------ | ------------------------------------------- | ------------------------------------------------------------ | ----------- | ------------------------------------------------------------ |
| 지역 변수 <br />(로컬 변수)    | 함수 내부에 선언                            | 함수 내부에서만 사용                                         | 스택        | 함수가 호출될 때 생성되고 함수가 끝나면 소멸함               |
| 멤버 변수<br />(인스턴스 변수) | 클래스 멤버 변수로 선언                     | 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능 | 힙          | 인스턴스가 생성될 때 힙에서 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨 |
| static 변수<br />(클래스 변수) | static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에서 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨 |

</br>

-----

</br>

### 🔎 단 하나만 존재하는 인스턴스 - singleton  pattern

> 생성자는 private으로<br>static으로 유일한 객체 생성<br>외부에서 유일한 객체를 참조할 수 있는 public static get()메서드 구현
>

</br>

## 💻실습

🌵🔥🌪️🌹🌻🍀🌱💻💡💣💊🎈🧷🔍🔎📌📍🎁🔑🗝️⏱️❓❗⭐

0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🔼🔽➡️⬅️〰️➰➿🎵🎶❌🚫💢



</br>

--------

</br>

# **🎈chapter 06** 배열과 ArrayList

## 🔎배열이란 ❓

> 동일한 자료형의 순차적 자료 구조<br>배열 선언하기<br>int[] arr = new int [10];<br>int arr[] = new int[10];
>

### 메모리 구조

![image-20210307104816855](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307104816855.png)

</br>

## 💻실습

> **배열 문제**
>
> 문자 배열을 생성하고 출력해 보세요<br>대문자를 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램을 만들어 보세요
>

![image-20210307111003551](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307111003551.png)

</br>

## 🔎기본 자료형 배열과 차조 자료형 배열 (객체 배열)

![image-20210307112332503](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307112332503.png)

</br>

## 🔎객체 배열 복사

### 📌얕은 복사 : 주소만 복사하기 때문에 둘 다 값이 같을 수 밖에 없다.

![image-20210307113531780](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307113531780.png)

</br>

### 📌깊은 복사 : 각각 인스턴스를 따로 선언 하여 복사하는 방법

![image-20210307113546047](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307113546047.png)

</br>

## 🔎향상된 for문(enhancedfor)

### 💡배열 요소의 처음부터 끝까지 모든 요소를 참조 할 떄 편리한 반복문

```java
for(변수 : 배열){
    반복 실행문;
}
```

</br>

## 🔎다차원 배열

> 2차원 이상의 배열
>
> 지도, 게임, 평면이나 공간을 구현할 때 사용

![image-20210307122350630](C:\Users\Aloha_wan\AppData\Roaming\Typora\typora-user-images\image-20210307122350630.png)

</br>

## 🔎 ArrayList 클래스

> 자바에서 제공되는 객체 배열이 구현된 클래스<br>객체 배열을 사용하는데 필요한 여러 메서드들이 구현되어 있음
>

</br>

### 		📌주요 메서드

| 메서드              | 설명                                                         |
| ------------------- | ------------------------------------------------------------ |
| boolean add(E e)    | 요소 하나를 배열에 추가합니다. E는 요소의 자료형을 의미합니다. |
| int size()          | 배열에 추가된 요소 전체 개수를 반환합니다.                   |
| E get(int index)    | 배열의 index 위치에 있는 요소 값을 반환합니다.               |
| E remove(int index) | 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다. |
| boolean is Empty()  | 배열이 비어있는지 확인합니다.                                |

### 💡 [ crtl + shift + O ] 자동 import 가능