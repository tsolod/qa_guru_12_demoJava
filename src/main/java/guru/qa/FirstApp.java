package guru.qa;

public class FirstApp {
 public static void main(String[] args) {
  char symbol;
  symbol = 'a';

  boolean flag = false;
  byte aByte = 123; //-128....127
  short aShort = -5;  //-32768...32767
  int aInt;
  long aLong = 123L;

  float afloat = 1.2F;
  double aDouble = 1.2D;

  String aString = "Kira";


  // + сложение
  // - вычитание
  // * умножение
  // / деление (целочисленное!)
  // % взятие остатка от деления

  // логические операторы
  // & И (&&)
  // | Или (||)
  // ! Отрицание
  // != не равно
  // == равно
  // instanceof
  // > больше
  // >= больше или равно
  // < меньше
  // <= меньше или равно


  System.out.println("Сумма - " + summ(aByte, (int) aLong));
  System.out.println("Отнимаем - " + minus((int) aLong, aShort));
  System.out.println("Делим - " + delim(aByte, (int) aLong));
  System.out.println("Умножаем - " + umnoj(aByte, (int) aLong));

  getMaxIntValue();
  getMaxIntPlus();
  getMinIntValue();
  getMaxIntMinus();

  if (aString.equals("Kira")) {
   System.out.println("Все верно!");
  } else {
   System.out.println("Все плохо!");
  }
 }


 static void getMaxIntValue() {
  System.out.println("Максимальное число INT " + Integer.MAX_VALUE);
 }

 static void getMinIntValue() {
  System.out.println("Минимальное число INT " + Integer.MIN_VALUE);
 }

 static int summ(int a, int b) {
  return a + b;
 }

 static int minus(int a, int b) {
  return a - b;
 }

 static int delim(int a, int b) {
  return a / b;
 }

 static int umnoj(int a, int b) {
  return a * b;
 }
// переполнение

 static void getMaxIntPlus() {
  System.out.println("Максимальное число INT + 1 = " + (Integer.MAX_VALUE + 1));
 }

 static void getMaxIntMinus() {
  System.out.println("Минимальное число INT - 1 = " + (Integer.MIN_VALUE - 1));
 }

}
