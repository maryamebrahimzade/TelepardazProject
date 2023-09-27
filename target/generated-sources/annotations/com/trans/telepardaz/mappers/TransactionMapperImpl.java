package com.trans.telepardaz.mappers;

import com.trans.telepardaz.dtos.TransactionDto;
import com.trans.telepardaz.dtos.TransactionDto.TransactionDtoBuilder;
import com.trans.telepardaz.exceptions.ServiceException;
import com.trans.telepardaz.models.Transaction;
import com.trans.telepardaz.models.Transaction.TransactionBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T15:59:10+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public Transaction convertDto(TransactionDto d) throws ServiceException {
        if ( d == null ) {
            return null;
        }

        TransactionBuilder transaction = Transaction.builder();

        transaction.trackingId( d.getTrackingId() );
        transaction.walletId( d.getWalletId() );
        transaction.user( d.getUser() );
        transaction.amount( d.getAmount() );
        transaction.status( d.getStatus() );
        transaction.transferMethod( d.getTransferMethod() );

        return transaction.build();
    }

    @Override
    public TransactionDto convertEntity(Transaction e) {
        if ( e == null ) {
            return null;
        }

        TransactionDtoBuilder transactionDto = TransactionDto.builder();

        transactionDto.walletId( e.getWalletId() );
        transactionDto.user( e.getUser() );
        transactionDto.trackingId( e.getTrackingId() );
        transactionDto.amount( e.getAmount() );
        transactionDto.status( e.getStatus() );
        transactionDto.transferMethod( e.getTransferMethod() );

        return transactionDto.build();
    }
}
