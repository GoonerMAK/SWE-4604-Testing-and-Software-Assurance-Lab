const test = require('./criteria');

//  -1 = Invalid
//  0  = Ineligible
//  1  = Scholarship 
//  2  = Normal 

describe('Strong Normal', () => {
  it('SN1 - Ineligible', () => {
    expect(test(68, 79, 72)).toBe(0); 
  });

  it('SN2 - Ineligible', () => {
    expect(test(80, 62, 64)).toBe(0); 
  });

  it('SN3 - Normal', () => {
    expect(test(82, 74, 70)).toBe(2); 
  });

  it('SN4 - Scholarship', () => {
    expect(test(89, 79, 82)).toBe(1); 
  });

  it('SN5 - Normal', () => {
    expect(test(78, 87, 70)).toBe(2); 
  });
});


describe('Weak Robust', () => {
  it('WR1 - Ineligible', () => {
    expect(test(68, 79, 72)).toBe(0); 
  });

  it('WR2 - Scholarship', () => {
    expect(test(89, 79, 82)).toBe(1); 
  });

  it('WR3 - Normal', () => {
    expect(test(78, 87, 70)).toBe(2); 
  });

  it('WR4 - Invalid', () => {
    expect(test(-7, 60, 79)).toBe(-1); 
  });

  it('WR5 - Invalid', () => {
    expect(test(70, -6, 88)).toBe(-1); 
  });

  it('WR6 - Invalid', () => {
    expect(test(170, 64, 55)).toBe(-1); 
  });

  it('WR7 - Invalid', () => {
    expect(test(91, 76, 122)).toBe(-1); 
  });
});


describe('Strong Robust', () => {
  it('SR1 - Normal', () => {
    expect(test(78, 76, 76)).toBe(2); 
  });

  it('SR2 - Invalid', () => {
    expect(test(-7, -6, 75)).toBe(-1); 
  });

  it('SR3 - Invalid', () => {
    expect(test(78, 181, 172)).toBe(-1); 
  });

  it('SR4 - Scholarship', () => {
    expect(test(86, 79, 77)).toBe(1); 
  });

  it('SR5 - Invalid', () => {
    expect(test(67, 72, -4)).toBe(-1); 
  });

  it('SR6 - Invalid', () => {
    expect(test(-2, 102, 150)).toBe(-1); 
  });
});
