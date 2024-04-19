function test(java, c_plus, ooad) 
{
  const sum = java + c_plus + ooad;

  if(java<0  ||  java>100  ||  c_plus<0  ||  c_plus>100  ||  ooad<0  ||  ooad>100)      // invalid
  {
    return -1;
  }

  else            // Valid
  {
    if(java<70  ||  c_plus<60  ||  ooad<60)
    {
      return 0;           // ineligible
    }

    else          // possibility of eligibility
    {
      if( sum<220 )               //  ineligible at first, check condition for eligibility
      {
        if( (java+c_plus) >= 150 )      // normal
        {
          return 2;
        }

        else                    // ineligible
          return 0;
      }

      else if( sum >= 220 )     // Eligible 
      {
        if(sum > 240)
        {
          return 1;             // scholarship
        }

        else
          return 2;             // normal
      }
    }
  }
}
  module.exports = test;