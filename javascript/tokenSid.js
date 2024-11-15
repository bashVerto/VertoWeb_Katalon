import { authenticator } from 'otplib';
const secret = 'GNOD442KB4SX4OJZ'; //will be provided by devs
const token = authenticator.generate(secret); //generatesOTP
console.log(token); //printsOTP