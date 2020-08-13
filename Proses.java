package com.tugas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Proses {

    public static List<Integer> dataRandom = new ArrayList<>();
    public static int[] data;

    public static void randomData(int maxRange){

        if (isDataReady()) {
            dataRandom.clear();
        }

        int batasBawah, batasAtas, range;
        Random random;

        batasBawah = Utility.validasiInputInteger("Batas Bawah : ");
        batasAtas = Utility.validasiInputInteger("Batas Atas : ");
        range = batasAtas - batasBawah + 1;

        random = new Random();

        for(int i = 0; i < maxRange; i++){
            int randomInteger =  random.nextInt(range) + batasBawah;
            dataRandom.add(randomInteger);
            System.out.print(dataRandom.get(i) + " ");
        }

        System.out.println();
    }

    public static void getDataRandom(int maxRange) {
        if (!isDataReady()) {
            System.out.println("Belum ada Data, Silahkan input data.\n");
            Proses.randomData(maxRange);
        }

        int size = dataRandom.size();
        data = new int[size];
        Integer[] dataTemp = dataRandom.toArray(new Integer[size]);
        for (int n = 0; n < size; ++n) {
            data[n] = dataTemp[n];
        }
    }

    public static void bubleSortAsc(int maxRange){

        getDataRandom(maxRange);

        int swap;
        for (int i = 0; i < data.length - 1; i++) {
            Utility.cetak("\nPass" + (i+1));
            Utility.cetak(Arrays.toString(data));

            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    swap = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = swap;
                    Utility.cetak(Arrays.toString(data));
                }
            }
            Utility.cetak("\nResult of pass " + (i + 1));
            Utility.cetak(Arrays.toString(data));
        }
    }

    public static void bubleSortDesc(int maxRange){

        getDataRandom(maxRange);

        int swap;
        for (int i = 0; i < data.length - 1; i++) {
            Utility.cetak("\nPass" + (i+1));
            Utility.cetak(Arrays.toString(data));

            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] < data[j]) {
                    swap = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = swap;
                    Utility.cetak(Arrays.toString(data));
                }
            }
            Utility.cetak("\nResult of pass " + (i + 1));
            Utility.cetak(Arrays.toString(data));
        }
    }

    public static void selectionSortAsc(int maxRange){

        getDataRandom(maxRange);
        Utility.cetak(Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int minIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minIndex = j;
                }
            }
            // swap data
            int temp = data[i];
            data[i] = min;
            data[minIndex] = temp;

            Utility.cetak("\nResult of pass " + (i + 1));
            Utility.cetak(Arrays.toString(data));
        }
    }

    public static void selectionSortDesc(int maxRange){

        getDataRandom(maxRange);
        Utility.cetak(Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            int max = data[i];
            int maxIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] > max) {
                    max = data[j];
                    maxIndex = j;
                }
            }
            // swap data
            int temp = data[i];
            data[i] = max;
            data[maxIndex] = temp;

            Utility.cetak("\nResult of pass " + (i + 1));
            Utility.cetak(Arrays.toString(data));
        }
    }

    protected static Boolean isDataReady(){
        return dataRandom.size() >= 1;
    }
}
