/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfigurasi;

/**
 *
 * @author Im-Bot
 */
public class Session {
    private static String nama;
    private static String alamat;
    private static String ttl;
    private static String jenisKelamin;
    private static String noTelp;
    private static float total_nilai;
    private static String jurursan_pil1;
    private static String jurursan_pil2;
    private static String status;

    public static int getStatus_tes() {
        return status_tes;
    }

    public static void setStatus_tes(int status_tes) {
        Session.status_tes = status_tes;
    }
    private static int status_tes;

    public static String getNoTelp() {
        return noTelp;
    }

    public static void setNoTelp(String noTelp) {
        Session.noTelp = noTelp;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Session.alamat = alamat;
    }

    public static String getTtl() {
        return ttl;
    }

    public static void setTtl(String ttl) {
        Session.ttl = ttl;
    }

    public static String getJenisKelamin() {
        return jenisKelamin;
    }

    public static void setJenisKelamin(String jenisKelamin) {
        Session.jenisKelamin = jenisKelamin;
    }

    public static float getTotal_nilai() {
        return total_nilai;
    }

    public static void setTotal_nilai(int total_nilai) {
        Session.total_nilai = total_nilai;
    }

    public static String getJurursan_pil1() {
        return jurursan_pil1;
    }

    public static void setJurursan_pil1(String jurursan_pil1) {
        Session.jurursan_pil1 = jurursan_pil1;
    }

    public static String getJurursan_pil2() {
        return jurursan_pil2;
    }

    public static void setJurursan_pil2(String jurursan_pil2) {
        Session.jurursan_pil2 = jurursan_pil2;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Session.status = status;
    }
    
}
