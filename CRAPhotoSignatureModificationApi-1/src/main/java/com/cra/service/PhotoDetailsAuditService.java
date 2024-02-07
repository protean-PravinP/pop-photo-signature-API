package com.cra.service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.model.PhotoDetailsAudit;

public interface PhotoDetailsAuditService {

	PhotoDetailsAudit save(PhotoAndSignatureUpdateDto PhotoAndSignatureUpdateDto);
}
