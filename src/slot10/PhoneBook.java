package slot10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p : phoneList){
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    return;
                }
                p.getPhone().add(phone);
                return;
            }
        }
        // ra ngoai for chắc chắn ko có name trùng
        PhoneNumber pn = new PhoneNumber(name,phone);
        phoneList.add(pn);
        return;
    }

    @Override
    void removePhone(String name) {
        for(PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                phoneList.remove(p);
                return;
            }
        }
        return;
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                if(p.getPhone().contains(oldPhone)){
                    p.getPhone().remove(oldPhone);
                    p.getPhone().add(newPhone);
                    return;
                }
                return;
            }
        }
        return;
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for(PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        // bubble sort
//        int size = phoneList.size();
//        for(int i=0;i< size-1;i++){
//            for(int j=0;j<size-i-1;j++){
//                String name_pj = phoneList.get(j).getName();
//                String name_pj1 = phoneList.get(j+1).getName();
//                if(name_pj.compareTo(name_pj1) > 0){
//                    PhoneNumber tmp = phoneList.get(j);
//                    phoneList.add(j,phoneList.get(j+1));
//                    phoneList.add(j+1,tmp);
//                }
//            }
//        }

//        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(phoneList, (o1,o2)-> o1.getName().compareTo(o2.getName())) ;
    }
}