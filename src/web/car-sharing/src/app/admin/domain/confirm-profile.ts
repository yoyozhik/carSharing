export class ConfirmProfile {
  id: number;
  login: String;
  confirmProfile: String;
  passportDataResponse: {
    id: number;
    firstName: String;
    lastName: String;
    middleName: String;
    seriesAndNumber: String;
    personalNumber: String;
    placeOfIssue: String;
    dateOfIssue: Date;
    validUntil: Date;
    registrationPhotoUrl: String;
    photoUrl: String;
  };
  driverLicenseResponse: {
    id: number;
    seriesAndNumber: String;
    category: String;
    frontSideImageUrl: String;
    backSideImageUrl: String;
  };
}
