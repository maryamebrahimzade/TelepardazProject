package com.trans.telepardaz.mappers.merchant;

import com.trans.telepardaz.dtos.merchant.PersonMerchantDto;
import com.trans.telepardaz.exceptions.ServiceException;
import com.trans.telepardaz.models.QrCode;
import com.trans.telepardaz.models.merchant.PersonMerchant;
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
public class PersonMerchantMapperImpl implements PersonMerchantMapper {

    @Override
    public PersonMerchant convertDto(PersonMerchantDto d) throws ServiceException {
        if ( d == null ) {
            return null;
        }

        PersonMerchant personMerchant = new PersonMerchant();

        personMerchant.setId( d.getId() );
        personMerchant.setVersion( d.getVersion() );
        personMerchant.setName( d.getName() );
        personMerchant.setPhone( d.getPhone() );
        personMerchant.setMobile( d.getMobile() );
        personMerchant.setEmail( d.getEmail() );
        personMerchant.setWebsite( d.getWebsite() );
        personMerchant.setIban( d.getIban() );
        personMerchant.setCode( d.getCode() );
        personMerchant.setCardNumber( d.getCardNumber() );
        personMerchant.setAccountNumber( d.getAccountNumber() );
        List<QrCode> list = d.getQrCodes();
        if ( list != null ) {
            personMerchant.setQrCodes( new ArrayList<QrCode>( list ) );
        }

        return personMerchant;
    }

    @Override
    public PersonMerchantDto convertEntity(PersonMerchant e) {
        if ( e == null ) {
            return null;
        }

        PersonMerchantDto personMerchantDto = new PersonMerchantDto();

        personMerchantDto.setId( e.getId() );
        personMerchantDto.setVersion( e.getVersion() );
        personMerchantDto.setName( e.getName() );
        personMerchantDto.setPhone( e.getPhone() );
        personMerchantDto.setMobile( e.getMobile() );
        personMerchantDto.setEmail( e.getEmail() );
        personMerchantDto.setWebsite( e.getWebsite() );
        personMerchantDto.setIban( e.getIban() );
        personMerchantDto.setCode( e.getCode() );
        personMerchantDto.setCardNumber( e.getCardNumber() );
        personMerchantDto.setAccountNumber( e.getAccountNumber() );
        List<QrCode> list = e.getQrCodes();
        if ( list != null ) {
            personMerchantDto.setQrCodes( new ArrayList<QrCode>( list ) );
        }

        return personMerchantDto;
    }
}
