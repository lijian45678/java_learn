package testjava;

import java.util.*;


public class Test1 {
    private List<String> list;
    private Map<String, String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Test1) {
            Test1 t1= (Test1)obj;
            if(this.list.size()==t1.list.size()) {
            }else return false;

        }
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Class t1 = Test1.class;

    }
}
