package com.tugas;

public class Main {

    public static int maxRange = 5;

    public static void main(String[] args) {

        boolean isOut = true;

        while (isOut) {
            Utility.cetak("\nSelamat Datang di Program Simulasi");
            Utility.cetak("Dibuat Oleh Kelompok 5");
            Utility.cetak("Menu");
            Utility.cetak("======\n");
            Utility.cetak("1.\tRandom Data");
            Utility.cetak("2.\tSimulasi Buble Sort - Ascending");
            Utility.cetak("3.\tSimulasi Selection Sort - Ascending");
            Utility.cetak("4.\tSimulasi Buble Sort - Descending");
            Utility.cetak("5.\tSimulasi Selection Sort - Descending");
            Utility.cetak("6.\tKeluar");

            int pilihanInput = Utility.validasiInputInteger("\nMasukkan Pilihan Anda (1-6) : ");

            switch (pilihanInput) {
                case 1 -> {
                    Utility.cetak("\nRANDOM DATA");
                    Utility.cetak("===========\n");
                    Proses.randomData(maxRange);
                }
                case 2 -> {
                    Utility.cetak("\nSIMULASI BUBLE SORT - ASC");
                    Utility.cetak("=========================");
                    Proses.bubleSortAsc(maxRange);
                }
                case 3 -> {
                    Utility.cetak("\nSIMULASI SELECTION SORT - ASC");
                    Utility.cetak("=============================");
                    Proses.selectionSortAsc(maxRange);
                }
                case 4 -> {
                    Utility.cetak("\nSIMULASI BUBLE SORT - DESC");
                    Utility.cetak("==========================");
                    Proses.bubleSortDesc(maxRange);
                }
                case 5 -> {
                    Utility.cetak("\nSIMULASI SELECTION SORT - DESC");
                    Utility.cetak("==============================");
                    Proses.selectionSortDesc(maxRange);
                }
                case 6 -> {
                    Utility.cetak("\nKELUAR");
                    Utility.cetak("======\n");
                    isOut = false;
                }
                default -> Utility.cetak("\nInput Anda salah,\nSilahkan masukkan pilihan 1-6");
            }
        }
    }
}
