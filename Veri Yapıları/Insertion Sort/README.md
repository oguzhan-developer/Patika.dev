# [22,27,16,2,18,6] -> Insertion Sort

## 1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

[22|,27,16,2,18,6] [22,27|,16,2,18,6] [22,27,16|,2,18,6] [16,22,27,2|,18,6] [2,16,22,27,18|,6]
[2,16,18,22,27,6|] [2,6,16,18,22,27]

## 2.Big-O gösterimini yazınız.
O(N^2) 

## 3.Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.

Avarage case: n/2 , Worst Case: n, Best Case: 1

## 4.Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

[22,27,16,2,18,6]
Worst Case kapsamına girer çünkü sonlarda, en kötü senaryolardan birisi.

## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

[7|,3,5,8,2,9,4,15,6] [7,3|,5,8,2,9,4,15,6] [3,7,5|,8,2,9,4,15,6] [3,5,7,8|,2,9,4,15,6]