# CodingTestStudy
코딩테스트 공부 (JAVA)

## 시간 복잡도(Time Complexity)
알고리즘의 수행시간을 평가

### 시간 복잡도 비교
* O(1) < O(logN) < O(N) < O(N*logN) < O(N^2) < O(2^N) < O(N!)

### O(1) - 상수 시간
* 입력 크기(N)가 커질 때 연산 횟수가 logN에 비례해서 증가하면 시간 복잡도는 O(logN)입니다.

### O(N)
* 입력 크기(N)가 커질 때 연산 횟수가 N에 비례해서 증가하면 시간 복잡도는 O(N)입니다.

### O(N²)
* 입력 크기(n)가 커질 때 연산 횟수가 N²에 비례해서 증가하면 시간 복잡도는 입니다.

### O(logN)
* 입력 크기가 커질 때 연산 횟수가 logN에 비례해서 증가하면 시간 복잡도는 O(logN)입니다.

### O(2ⁿ)
* 입력 크기가 커질 때 연산수가 2ⁿ에 비례해서 증가하면 시간 복잡도는 O(2ⁿ)입니다.

### 1초에 최대 연산 횟수(최대 입력 크기)
시간 복잡도	최대 연산 횟수 <br>
  O(N)	       약 1억번  <br>
  O(N^2)	   약 1만번  <br>
  O(N^3)	   약 500번  <br>
  O(2^N)	   약  20번  <br>
  O(N!)           10번  <br>

### 제한 시간이 1초 일 경우, N의 범위에 따른 시간 복잡도 선택
N의 범위가 500: 시간 복잡도가 O(N^3) 이하인 알고리즘을 설계  <br>
N의 범위가 2,000: 시간 복잡도가 O(N^2) 이하인 알고리즘을 설계  <br>
N의 범위가 100,000: 시간 복잡도가 O(NlogN) 이하인 알고리즘을 설계  <br>
N의 범위가 10,000,000: 시간 복잡도가 O(N) 이하인 알고리즘을 설계  <br>
N의 범위가 10,000,000,000: 시간 복잡도가 O(logN) 이하인 알고리즘을 설계  <br> 

## 정렬 알고리즘 

### sort() 함수
* 자바에서 기본적으로 제공하는 sort()함수의 시간 복잡도는 O(nlogn)입니다.

### 버블 정렬
* 데이터의 인접 요소끼리 비교하고, swap 연산을 수행하며 정렬하는 방식
* 시간 복잡도는 O(N²)으로 다른 정렬 알고리즘보다 속도가 느린 편

### 선택 정렬
* 대상에서 가장 크거나 작은 데이터를 찾아가 선택을 반복하면서 정렬하는 방식
* 시간 복잡도 O(N²)으로 효율적이지 않아 많이 사용하진 않음

### 삽입 정렬
* 대상을 선택해 정렬된 영역에서 선택 데이터의 적절한 위치를 찾아 삽입하면서 정렬하는 방식
 
### 퀵 정렬
* pivot 값을 선정해 해당 값을 기준으로 정렬하는 방식

### 병합 정렬
* 이미 정렬된 부분 집합들을 효율적으로 병합해 전체를 정렬하는 방식

### 기수 정렬
* 데이터의 자릿수를 바탕으로 비교해 데이터를 정렬하는 방식

## 탐색

## 스택과 큐
* 스택 
--  쌓아올린다는 것을 의미, LIFO(Last In First Out) 방식

* 큐
-- 줄을 서서 기다리는 것, FIFO(First In First Out) 방식












