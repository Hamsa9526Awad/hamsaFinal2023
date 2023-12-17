package awd.example.hamsafinal2023.Data.numbers;
import androidx.room.Entity;

@Entity//Entity==Table==جدول

public class Number {

    public int num;
    public int brailNum;

    public void setNum(int num) {
        if(num==1)
        {
            brailNum = NumberUtil.n1;
        }
        if(num==2)
        {
            brailNum=NumberUtil.n2;
        }
        if(num==3)
        {
            brailNum=NumberUtil.n3;
        }
        if(num==4)
        {
            brailNum=NumberUtil.n4;
        }
        if(num==5)
        {
            brailNum=NumberUtil.n5;
        }
        if(num==6)
        {
            brailNum=NumberUtil.n6;
        }
        if(num==7)
        {
            brailNum=NumberUtil.n7;
        }
        if(num==8)
        {
            brailNum=NumberUtil.n8;
        }
        if(num==9)
        {
            brailNum=NumberUtil.n9;
        }
        if(num==0)
        {
            brailNum=NumberUtil.n0;
        }

    }
}
