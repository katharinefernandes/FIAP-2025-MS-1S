package com.example.demo.service;

import com.example.demo.model.Voucher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

@Service
public class VoucherService {
  private final Map<String, Voucher> vouchers = new ConcurrentHashMap<>();

  public List<Voucher> findAll() {
    return new ArrayList<>(vouchers.values());
  }

  public Voucher findByCode(String code) {
    Voucher voucher = vouchers.get(code);
    return vouchers.get(code);
  }

}
