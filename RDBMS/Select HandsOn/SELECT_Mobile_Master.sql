select ime_no,model_name,warranty_in_years,price, (price*0.13) as discount from mobile_master where lower(model_name) like 'samsung%';
