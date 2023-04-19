@Order
Feature: Order
  As a user
  I want to order
  So that I can order

  @Order
  Scenario: Order
    Given Account signed in
    When Click on product
    And Click on Tambah ke keranjang button
    And Click on Tambahkan button
    And Click on keranjang icon
    And Select metode pengambilan ambil sendiri
    And Click on Pilih pembayaran button
    And Select metode pembayaran
    And Click on Bayar button
    Then Order complete