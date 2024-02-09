package com.example.srasizde;

import android.util.Log;

public class Personal {
    public void setYas(int yas) {
    }

    public int getYas() {
        return 0;
    }

    public class personel {
        private int yas;

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            if(yas<18 || yas>55){
                Log.e("Kapsülleme", "Hatalı yaş");
                yas = 18;
            }
            this.yas = yas;
        }
    }
}
