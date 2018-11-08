package com.example.piyus.pesuplacement;

import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class FilterList  {

    List<FilterItem> fList=new ArrayList<FilterItem>();
    int checkedCount;
    String filterName;
    public FilterList(String filterName){
        this.checkedCount=0;
        this.filterName=filterName;

    }
    public void setChecked(){
        this.checkedCount++;
    }

    public void unsetChecked(){
        if(this.checkedCount>0)this.checkedCount--;
    }

    public void add(String item){
        FilterItem f = new FilterItem(item);
        this.fList.add(f);
    }



}
