package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voucher {
  private String code;
  private Double pctDiscont;
  private LocalDate validateDate;
  private VoucherTypeEnum type;
  private Double minimumValue;
  private LocalDate expirationDate;
}
