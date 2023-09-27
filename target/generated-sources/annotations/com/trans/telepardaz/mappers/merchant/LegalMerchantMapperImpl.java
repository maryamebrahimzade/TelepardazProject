package com.trans.telepardaz.mappers.merchant;

import com.trans.telepardaz.dtos.merchant.LegalMerchantDto;
import com.trans.telepardaz.exceptions.ServiceException;
import com.trans.telepardaz.models.QrCode;
import com.trans.telepardaz.models.merchant.LegalMerchant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T15:59:10+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class LegalMerchantMapperImpl implements LegalMerchantMapper {

    @Override
    public LegalMerchant convertDto(LegalMerchantDto d) throws ServiceException {
        if ( d == null ) {
            return null;
        }

        LegalMerchant legalMerchant = new LegalMerchant();

        legalMerchant.setId( d.getId() );
        legalMerchant.setVersion( d.getVersion() );
        legalMerchant.setName( d.getName() );
        legalMerchant.setPhone( d.getPhone() );
        legalMerchant.setMobile( d.getMobile() );
        legalMerchant.setEmail( d.getEmail() );
        legalMerchant.setWebsite( d.getWebsite() );
        legalMerchant.setIban( d.getIban() );
        legalMerchant.setCode( d.getCode() );
        legalMerchant.setCardNumber( d.getCardNumber() );
        legalMerchant.setAccountNumber( d.getAccountNumber() );
        List<QrCode> list = d.getQrCodes();
        if ( list != null ) {
            legalMerchant.setQrCodes( new ArrayList<QrCode>( list ) );
        }
        legalMerchant.setPostalCode( d.getPostalCode() );
        legalMerchant.setDescription( d.getDescription() );
        legalMerchant.setAddress( d.getAddress() );

        return legalMerchant;
    }

    @Override
    public LegalMerchantDto convertEntity(LegalMerchant e) {
        if ( e == null ) {
            return null;
        }

        LegalMerchantDto legalMerchantDto = new LegalMerchantDto();

        legalMerchantDto.setId( e.getId() );
        legalMerchantDto.setVersion( e.getVersion() );
        legalMerchantDto.setName( e.getName() );
        legalMerchantDto.setPhone( e.getPhone() );
        legalMerchantDto.setMobile( e.getMobile() );
        legalMerchantDto.setEmail( e.getEmail() );
        legalMerchantDto.setWebsite( e.getWebsite() );
        legalMerchantDto.setIban( e.getIban() );
        legalMerchantDto.setCode( e.getCode() );
        legalMerchantDto.setCardNumber( e.getCardNumber() );
        legalMerchantDto.setAccountNumber( e.getAccountNumber() );
        List<QrCode> list = e.getQrCodes();
        if ( list != null ) {
            legalMerchantDto.setQrCodes( new ArrayList<QrCode>( list ) );
        }
        legalMerchantDto.setPostalCode( e.getPostalCode() );
        legalMerchantDto.setDescription( e.getDescription() );
        legalMerchantDto.setAddress( e.getAddress() );

        return legalMerchantDto;
    }
}
