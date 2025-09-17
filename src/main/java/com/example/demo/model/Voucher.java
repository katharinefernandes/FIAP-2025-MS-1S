package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Voucher {
  private String code;
  private VoucherTypeEnum type;
  private BigDecimal value;
  private BigDecimal minimumPurchase;
  private Integer usageLimit;
  private Integer usageCount;
  private LocalDate expirationDate;
}
