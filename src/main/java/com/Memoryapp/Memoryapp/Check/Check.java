package com.Memoryapp.Memoryapp.Check;

import com.Memoryapp.Memoryapp.Model.List;

import java.util.ArrayList;
import java.util.Date;


public class Check {
    Date todaysdate;
    ArrayList<List> list;
    public Check(){
        this.todaysdate = new Date();
        this.list = new ArrayList<List>();

    }
    public ArrayList<List> check7daysahead(ArrayList<List> list1){
        int Month = todaysdate.getMonth() +1;
        System.out.println(Month);
        System.out.println(todaysdate.getMonth());
        System.out.println("llll");
       // System.out.println(list1.get(1).getMonth());
        for(int i = 0; i< list1.size(); i++) {
            System.out.println("pooo");
            System.out.println(list1.get(i).getMonth());
            if (todaysdate.getMonth() == 8 || todaysdate.getMonth() == 3 || todaysdate.getMonth() == 5 || todaysdate.getMonth() == 10){
                if(Month == (list1.get(i).getMonth())) {
                    if(list1.get(i).getDay() <= 25) {
                        if (list1.get(i).getDay() == (todaysdate.getDate() +1) || list1.get(i).getDay() == (todaysdate.getDate() + 2) || list1.get(i).getDay() == (todaysdate.getDate() + 3)|| list1.get(i).getDay() == (todaysdate.getDate() + 4)|| list1.get(i).getDay() == (todaysdate.getDate() + 5)|| list1.get(i).getDay() == (todaysdate.getDate() + 6)|| list1.get(i).getDay() == (todaysdate.getDate() + 7)|| list1.get(i).getDay() == (todaysdate.getDate() + 8)) {
                            this.list.add(list1.get(i));
                        }
                    }
                }
            }
            else if (todaysdate.getMonth() == 0 || todaysdate.getMonth() == 2 || todaysdate.getMonth() == 4 || todaysdate.getMonth() == 6 || todaysdate.getMonth() == 7 || todaysdate.getMonth() == 9 || todaysdate.getMonth() == 11){
                System.out.println("llooo");
                if(Month== list1.get(i).getMonth()) {
                System.out.println("uuuu");
                   if( list1.get(i).getDay() <= 26) {
                       System.out.println(";;;;;");
                       if (list1.get(i).getDay() == (todaysdate.getDate() +1) || list1.get(i).getDay() == (todaysdate.getDate() + 2) || list1.get(i).getDay() == (todaysdate.getDate() + 3)|| list1.get(i).getDay() == (todaysdate.getDate() + 4)|| list1.get(i).getDay() == (todaysdate.getDate() + 5)|| list1.get(i).getDay() == (todaysdate.getDate() + 6)|| list1.get(i).getDay() == (todaysdate.getDate() + 7)|| list1.get(i).getDay() == (todaysdate.getDate() + 8)) {
                           System.out.println("llllllll");
                           this.list.add(list1.get(i));
                       }
                   }
                }
            }


            else if (Month == list1.get(i).getMonth()){
                if(todaysdate.getMonth() == 1) {
                    if( list1.get(i).getDay() <= 22) {
                        if (list1.get(i).getDay() == (todaysdate.getDate() + 1) || list1.get(i).getDay() == (todaysdate.getDate() + 2) || list1.get(i).getDay() == (todaysdate.getDate() + 3)|| list1.get(i).getDay() == (todaysdate.getDate() + 4)|| list1.get(i).getDay() == (todaysdate.getDate() + 5)|| list1.get(i).getDay() == (todaysdate.getDate() + 6)|| list1.get(i).getDay() == (todaysdate.getDate() + 7)|| list1.get(i).getDay() == (todaysdate.getDate() + 8)) {
                            this.list.add(list1.get(i));
                        }
                    }
                }
            }

            else if  (todaysdate.getMonth()  == 1 && todaysdate.getDate() == 22){
                if(list1.get(i).getMonth()== 3 && list1.get(i).getDay() <= 1  ||list1.get(i).getMonth() == 2 && list1.get(i).getDay() <=28 && list1.get(i).getDay() >= 22){
                    this.list.add(list1.get(i));

                }


            }
            else if ( todaysdate.getMonth() == 1 && todaysdate.getDate() == 23){
                if(list1.get(i).getMonth()== 3 && list1.get(i).getDay() <= 2  ||list1.get(i).getMonth() == 2 && list1.get(i).getDay() <=28 && list1.get(i).getDay() >= 23){
                    this.list.add(list1.get(i));

                }


            }
            else if ( todaysdate.getMonth() == 1 && todaysdate.getDate() == 24){
                if(list1.get(i).getMonth()== 3 && list1.get(i).getDay() <= 3  ||list1.get(i).getMonth() == 2 && list1.get(i).getDay() <=28 && list1.get(i).getDay() >= 24){
                    this.list.add(list1.get(i));

                }


            }
            else if ( todaysdate.getMonth() == 1 && todaysdate.getDate() == 25){
                if(list1.get(i).getMonth()== 3 && list1.get(i).getDay() <= 4  ||list1.get(i).getMonth() == 2 && list1.get(i).getDay() <=28 && list1.get(i).getDay() >= 25){
                    this.list.add(list1.get(i));

                }


            }
            else if ( todaysdate.getMonth() == 1 && todaysdate.getDate() == 26) {
                if (list1.get(i).getMonth() == 3 && list1.get(i).getDay() <= 5 || list1.get(i).getMonth() == 2 && list1.get(i).getDay() <= 28 && list1.get(i).getDay() >= 26) {
                    this.list.add(list1.get(i));

                }
            }
            else if ( todaysdate.getMonth() == 1 && todaysdate.getDate() == 27) {
                if (list1.get(i).getMonth() == 3 && list1.get(i).getDay() <= 6 || list1.get(i).getMonth() == 2 && list1.get(i).getDay() <= 28 && list1.get(i).getDay() >= 27) {
                    this.list.add(list1.get(i));

                }
            }
            else if ( (todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()== 6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11) && todaysdate.getDate() == 25){
                if( list1.get(i).getDay() == 1  ||(list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12)  && list1.get(i).getDay() <=31 && list1.get(i).getDay() >= 26){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()== 6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11)  && todaysdate.getDate() == 26){
                if( list1.get(i).getDay() <= 2  ||(list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12)  && list1.get(i).getDay() <=31 && list1.get(i).getDay() >= 27){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()== 6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11) && todaysdate.getDate() == 27){
                if( list1.get(i).getDay() <= 3  ||(list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12)  && list1.get(i).getDay() <=31 && list1.get(i).getDay() >= 28){
                    this.list.add(list1.get(i));

                }


            }
            else if ((todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()== 6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11)&& todaysdate.getDate() == 28){
                if( list1.get(i).getDay() <= 4  ||(list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12)  && list1.get(i).getDay() <=31 && list1.get(i).getDay() >= 29){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()==6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11) && todaysdate.getDate() == 29) {
                if ( list1.get(i).getDay() <= 5 || (list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12)  && list1.get(i).getDay() <= 31 && list1.get(i).getDay() >= 30) {
                    this.list.add(list1.get(i));

                }
            }
            else if ((todaysdate.getMonth() == 0 || todaysdate.getMonth()== 2 || todaysdate.getMonth()==4 || todaysdate.getMonth()== 6 || todaysdate.getMonth()== 7 || todaysdate.getMonth()==9 || todaysdate.getMonth()== 11) && todaysdate.getDate() == 30) {
                if (list1.get(i).getDay() <= 6 || (list1.get(i).getMonth() == 1 || list1.get(i).getMonth() == 3 || list1.get(i).getMonth() == 5 || list1.get(i).getMonth() == 7 || list1.get(i).getMonth()== 8 || list1.get(i).getMonth()== 10 || list1.get(i).getMonth() ==12) && list1.get(i).getDay() <= 31 && list1.get(i).getDay() >= 31) {
                    this.list.add(list1.get(i));

                }
            }
            else if ( (todaysdate.getMonth() == 8 || todaysdate.getMonth()== 3 || todaysdate.getMonth()==5 || todaysdate.getMonth()== 10 ) && todaysdate.getDate() == 24){
                if( list1.get(i).getDay() == 1  ||(list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11) && list1.get(i).getDay() <=30 && list1.get(i).getDay() >= 25){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 8 || todaysdate.getMonth()== 3 || todaysdate.getMonth()==5 || todaysdate.getMonth()== 10 ) && todaysdate.getDate() == 25){
                if( list1.get(i).getDay() <= 2  ||(list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11) && list1.get(i).getDay() <=30 && list1.get(i).getDay() >= 26){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 8 || todaysdate.getMonth()== 3 || todaysdate.getMonth()==5 || todaysdate.getMonth()== 10 ) && todaysdate.getDate() == 26){
                if(list1.get(i).getDay() <= 3  ||(list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11) && list1.get(i).getDay() <=30 && list1.get(i).getDay() >= 27){
                    this.list.add(list1.get(i));

                }


            }
            else if ((todaysdate.getMonth() == 8 || todaysdate.getMonth()== 3 || todaysdate.getMonth()==5 || todaysdate.getMonth()== 10 )&& todaysdate.getDate() == 27){
                if( list1.get(i).getDay() <= 4  ||(list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11) && list1.get(i).getDay() <=30 && list1.get(i).getDay() >= 28){
                    this.list.add(list1.get(i));

                }


            }
            else if ( (todaysdate.getMonth() == 8 || todaysdate.getMonth()== 3 || todaysdate.getMonth()==5 || todaysdate.getMonth()== 10 ) && todaysdate.getDate() == 28) {
                if (list1.get(i).getDay() <= 5 || (list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11)&& list1.get(i).getDay() <= 30 && list1.get(i).getDay() >= 29) {
                    this.list.add(list1.get(i));

                }
            }
            else if (((todaysdate.getMonth() == 8) || (todaysdate.getMonth() == 3) || (todaysdate.getMonth() == 5) || (todaysdate.getMonth() == 10)) && (todaysdate.getDate() == 29)) {
                if ( list1.get(i).getDay() <= 6 || (list1.get(i).getMonth() == 9 || list1.get(i).getMonth() == 4 || list1.get(i).getMonth()== 6 || list1.get(i).getMonth() == 11) && list1.get(i).getDay() == 30 ) {
                    this.list.add(list1.get(i));

                }
            }





        }

       return this.list;
    }

}
