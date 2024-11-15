import { authenticator } from 'otplib';
 
const secret = 'NFZUORCKHBPRO7B4';
const token = authenticator.generate(secret);

console.log(token)