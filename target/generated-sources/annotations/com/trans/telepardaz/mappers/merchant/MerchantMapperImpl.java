package com.trans.telepardaz.mappers.merchant;

import com.trans.telepardaz.dtos.merchant.MerchantDto;
import com.trans.telepardaz.exceptions.ServiceException;
import com.trans.telepardaz.models.QrCode;
import com.trans.telepardaz.models.merchant.Merchant;
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
public class MerchantMapperImpl implements MerchantMapper {

    @Override
    public Merchant convertDto(MerchantDto d) throws ServiceException {
        if ( d == null ) {
            return null;
        }

        Merchant merchant = new Merchant();

        merchant.setId( d.getId() );
        merchant.setVersion( d.getVersion() );
        merchant.setName( d.getName() );
        merchant.setPhone( d.getPhone() );
        merchant.setMobile( d.getMobile() );
        merchant.setEmail( d.getEmail() );
        merchant.setWebsite( d.getWebsite() );
        merchant.setIban( d.getIban() );
        merchant.setCode( d.getCode() );
        merchant.setCardNumber( d.getCardNumber() );
        merchant.setAccountNumber( d.getAccountNumber() );
        List<QrCode> list = d.getQrCodes();
        if ( list != null ) {
            merchant.setQrCodes( new ArrayList<QrCode>( list ) );
        }

        return merchant;
    }

    @Override
    public MerchantDto convertEntity(Merchant e) {
        if ( e == null ) {
            return null;
        }

        MerchantDto merchantDto = new MerchantDto();

        merchantDto.setId( e.getId() );
        merchantDto.setVersion( e.getVersion() );
        merchantDto.setName( e.getName() );
        merchantDto.setPhone( e.getPhone() );
        merchantDto.setMobile( e.getMobile() );
        merchantDto.setEmail( e.getEmail() );
        merchantDto.setWebsite( e.getWebsite() );
        merchantDto.setIban( e.getIban() );
        merchantDto.setCode( e.getCode() );
        merchantDto.setCardNumber( e.getCardNumber() );
        merchantDto.setAccountNumber( e.getAccountNumber() );
        List<QrCode> list = e.getQrCodes();
        if ( list != null ) {
            merchantDto.setQrCodes( new ArrayList<QrCode>( list ) );
        }

        return merchantDto;
    }
}
