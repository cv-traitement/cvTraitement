package net.oussama.cvtraitementbackend.mappers;

import net.oussama.cvtraitementbackend.dtos.*;
import net.oussama.cvtraitementbackend.entites.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class Dtomappers {
    public Dtocontact convertContactToDtocontact(ContactUs contactus) {
        Dtocontact dtocontact = new Dtocontact();
        BeanUtils.copyProperties(contactus, dtocontact);
        return dtocontact;
    }
    public ContactUs convertDtocontactToContactUs(Dtocontact dtocontact) {
        ContactUs contactUs = new ContactUs();
        BeanUtils.copyProperties(dtocontact, contactUs);
        return contactUs;
    }
    public DtoCompanyWorkspace convertCompanyWorkspacetoDtoCompanyWorkspace(CompanyWorkspace compnayworkspace) {
        DtoCompanyWorkspace dtocompanyWorkspace = new DtoCompanyWorkspace();
        BeanUtils.copyProperties(compnayworkspace, dtocompanyWorkspace);
        return dtocompanyWorkspace;
    }
    public CompanyWorkspace convertDtocompanyWorkspaceetoCompanyWorkspace(DtoCompanyWorkspace dtocompanyWorkspace) {
        CompanyWorkspace companyWorkspace = new CompanyWorkspace();
        BeanUtils.copyProperties(dtocompanyWorkspace, dtocompanyWorkspace);
        return companyWorkspace;
    }
    public LicenseDto converlisencetoDtoLicense(Licence licence){
        LicenseDto licenseDto = new LicenseDto();
        BeanUtils.copyProperties(licence, licenseDto);
        return licenseDto;
    }
    public Licence convertDtoLicenseetoLicence(Licence licence){
        Licence licenceDto = new Licence();
        BeanUtils.copyProperties(licenceDto, licence);
        return licenceDto;
    }
    public UsersDto convertuserDtotouser(Users users){
        UsersDto usersDto = new UsersDto();
        BeanUtils.copyProperties(users, usersDto);
        return usersDto;
    }
    public Users convertuserDtotousers(UsersDto usersDto){
        Users users = new Users();
        BeanUtils.copyProperties(usersDto, users);
        return users;
    }
    public DtoRole convertroletoDtoRole(Role role){
        DtoRole dtoRole = new DtoRole();
        BeanUtils.copyProperties(role, dtoRole);
        return dtoRole;
    }
    public Role convertRoleDtotoRole(Role role){
        Role roleDto = new Role();
        BeanUtils.copyProperties(roleDto, role);
        return roleDto;
    }
}
