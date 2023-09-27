package com.trans.telepardaz.mappers;

import com.trans.telepardaz.dtos.QRCodeDto;
import com.trans.telepardaz.exceptions.ServiceException;
import com.trans.telepardaz.models.QrCode;
import com.trans.telepardaz.models.QrCode.QrCodeBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T15:59:10+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class QRCodeMapperImpl implements QRCodeMapper {

    @Override
    public QrCode convertDto(QRCodeDto d) throws ServiceException {
        if ( d == null ) {
            return null;
        }

        QrCodeBuilder qrCode = QrCode.builder();

        qrCode.terminalId( d.getTerminalId() );

        return qrCode.build();
    }

    @Override
    public QRCodeDto convertEntity(QrCode e) {
        if ( e == null ) {
            return null;
        }

        QRCodeDto qRCodeDto = new QRCodeDto();

        qRCodeDto.setId( e.getId() );
        qRCodeDto.setVersion( e.getVersion() );
        qRCodeDto.setTerminalId( e.getTerminalId() );

        return qRCodeDto;
    }
}
