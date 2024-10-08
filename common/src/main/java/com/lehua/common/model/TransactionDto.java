package com.lehua.common.model;


import jakarta.validation.constraints.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TransactionDto {

    @NotBlank(message = "transaction id is mandatory")
    @Size(
            min = 32,
            max = 32,
            message = "transaction id must be a string of 32 characters"
    )
    private String id;

    @NotBlank(message = "Sender account id is mandatory")
    @Size(
            min = 12,
            max = 12,
            message = "Sender account id must be a string of 32 characters"
    )
    private String senderAccountId;

    @NotBlank(message = "Receiver account id is mandatory")
    @Size(
            min = 12,
            max = 12,
            message = "Receiver account id must be a string of 32 characters"
    )
    private String receiverAccountId;

    @Positive(message = "Amount must be positive")
    private double amount;

    private Concurrency concurrency;

    @NotBlank(message = "Location is mandatory")
    private String location;

}
