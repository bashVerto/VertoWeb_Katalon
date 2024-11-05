import { authenticator } from 'otplib';
 
const secret = 'MJEGULRGOANWCIBA';
const token = authenticator.generate(secret);

console.log(token)